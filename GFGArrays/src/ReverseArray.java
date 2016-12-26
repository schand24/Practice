
public class ReverseArray {
	
	int[] reverseArray1(int[] a){
		int len = a.length;
		int j = len-1;
		for(int i=0;i<len/2;i++){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		return a;
	}
	void reverseArray2(int[] a,int i, int j){
		if(i>=j)
			return;
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		reverseArray2(a,i+1,j-1);
		
		
	}

}
