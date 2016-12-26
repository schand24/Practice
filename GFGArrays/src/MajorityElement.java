
public class MajorityElement {
	//Sort the array in nlogn HeapSort and then check if the array contains majority element;
	int findMajorityElement_1(int[] a){
		a = heapSort(a);
		int count = 1,maxlen =0,candidate = a[0];
		int maxIndex =0;
		for(int i =1; i<a.length;i++){
			if(candidate == a[i]){
				count++;
			}
			else{
				candidate = a[i];
				count = 1;
				
			}
			if(count > maxlen){
				maxIndex = candidate;
				maxlen = count;
			}
				
		}
		if(maxlen > (a.length/2))
			return a[maxIndex];
		else
			return 0;
		
	}
	
	int[] heapSort(int[] a){
		int len = a.length;
		for(int i = len/2-1; i>=0;i--){
			heapify(a,len,i);
		}
		for(int i = len-1;i>=0; i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			
			heapify(a,i,0);
		}
		return a;
	}
	void heapify(int[] a,int len, int index){
		int largest = index;
		int l = 2 * index + 1;
		int r = 2 * index + 2;
		
		if(l<len && a[l] > a[largest])
			largest = l;
		if(r < len && a[r] > a[largest])
			largest = r;
		
		if(largest != index){
			int temp = a[largest];
			a[largest] = a[index];
			a[index] = temp;
			
			heapify(a,len,largest);
		}
	}
	
	//Using Moore's voting algoritm
	//1) find candidate for majority element;
	//2) check if candidate is majority element
	
	int findMajorityElement2(int[] a){
		//find candidate
		int count = 0,candidate=0;
		for(int i=0;i<a.length;i++){
			if(count ==0){
				candidate = a[i];
				count = 1;
			}
			else{
				if(candidate == a[i]){
					count++;
				}
				else
					count--;
			}
		}
		if(count ==0){
			return 0;
		}
		else{
			count = 0;
			for(int i =0; i<a.length;i++){
				if(a[i] == candidate)
					count++;
			}
			if(count > a.length /2){
				return candidate;
			}
			else
				return 0;
		}
	}
	
}
