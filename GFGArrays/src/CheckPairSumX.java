import java.util.Hashtable;

public class CheckPairSumX {
	//This method is using Hashmap to store the results.
	//Time complexity is O(n) and space is O(n).
	int findPairwithX(int[] a,int x){
		int count = 0;
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			int temp = x-a[i];
			if(!table.containsKey(a[i])){
				table.put(temp, 1);
			}
			else{
				count++;
				System.out.println(a[i] +"  "+ (x-a[i]));
			}
		}
		return count;
	}
	//this method is not using any extra space
	//method follows sorting elements and then find if the x-a[i] exists in array
	
	int findPairwithX_2(int[] a, int x){
		a = heapSort(a);
		int len = a.length;
		int count=0;
		int l = 0;
		int r = len-1;
		while(l<r){
			if(a[l] + a[r] == x){
				count++;
				l++;r--;
			}
				
			else if(a[l] + a[r] < x){
				l++;
			}
			else
				r--;
		}
		return count;
	}
	int[] heapSort(int[] a){
		int len = a.length;
		for(int i=len/2-1; i>=0; i--)
			a = heapify(a,i,len);
		for(int i=len-1;i>=0;i--){
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			
			a = heapify(a,0,i);
		}
		return a;
	}
	
	int[] heapify(int[] a,int index,int len){
		
		int largest = index;
		int l = 2 * index + 1;
		int r = 2 * index + 2;
		
		if(l < len && a[l] > a[largest])
			largest = l;
		
		if( r < len && a[r] > a[largest])
			largest = r;
		
		if(largest != index){
			int temp = a[largest];
			a[largest] = a[index];
			a[index] = temp;
			
			return heapify(a,largest,len);
		}
		return a;
	}
}
