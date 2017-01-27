
public class BlockSwap {
	
	void blockSwap(int[] a,int d){
		for(int i=0; i+d < a.length;i++){
			rotate(a,i,i+d);
		}
		printArray(a);
	}
	void printArray(int[] a){
		for(int i = 0; i< a.length;i++){
			System.out.println(a[i]);
		}
	}
	void rotate(int[] a,int i, int j){
		int p = j;
		for(int k = i; k< (i+j)/2 ; k++){
			int temp = a[k];
			a[k] = a[p];
			a[p] = temp;
			p--;
		}
	}
}
