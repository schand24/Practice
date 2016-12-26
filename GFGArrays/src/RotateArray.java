
public class RotateArray {
	//Method1: using Extra space to store given d values;
	/*
	 * Time Complexity: O(N)
	 * Space Complexity: O(D)
	 * */
	void rotateArray1(int[] a,int d){
		int[] t = new int[d];
		for(int i = 0; i<d; i++){
			t[i] = a[i];
		}
		for(int i=d; i<a.length;i++){
			a[i-d] = a[i];
		}
		int j = 0;
		for(int i = a.length-d;i<a.length;i++){
			a[i] = t[j++];
		}
		printArray(a);
	}
	//Method2: roate one element by one d times;
	/*
	 * Time complexity : O(N * D)
	 * Space Complexity: O(1)
	 * */
	void rotateArray2(int[] a,int d){
		int count = 0;
		while(count < d){
			int t = a[0];
			for(int i =0;i<a.length-1;i++){
				a[i] = a[i+1];
				
			}
			a[a.length-1] = t;
			count++;
		}
		printArray(a);
	}
	//ethod3: Juggling Algorithm)
	/*
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * */
	void rotateArray3(int[] a,int d){
		int count = 0;
		int i=0;
		while(i<gcd(d,a.length)){
			int t = a[i],p = i;
			while(true){
				int k = p + d;
				if(k >= a.length)
					k = k - a.length;
				if(k == i)
					break;
				a[p] = a[k];
				p = k;
			}
			a[p] = t;
			i++;
			count++;
		}
		printArray(a);
	}
	
	//Method4: Reversal Algorithm:
	/*
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * */
	
	void rotateArray4(int[] a,int d){
		rotate(a,0,d);
		rotate(a,d+1,a.length-1);
		rotate(a,0,a.length-1);
		
		printArray(a);
		
	}
	void rotate(int[] a,int i, int j){
		int p =j;
		for(int k = i; k<(i+j)/2;k++){
			int temp = a[k];
			a[k] = a[p];
			a[p] = temp;
			p--;
		}
	}
	
	void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	int gcd(int a, int b){
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
}
