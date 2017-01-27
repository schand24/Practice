
public class Segregate0and1 {
	/*Method1: Count num of 0s and place num zeros at the begining and keep remaining n-num 1 at the right
	 * TimeComplexity: O(N)
	 * */
	void doSegregate1(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i] == 0)
				count++;
		}
		for(int i =0;i<a.length;i++){
			if(count >0){
				a[i] = 0;
				count--;
			}
			else
				a[i] = 1;
		}
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	/*Method2: take left and right pointers 
	 * increment left while left ==0 and left<right
	 * decrement right while right == 1 and left<right
	 * swap a[left] and a[right]
	 * 
	 * TimeComplexity: O(N)
	 * */
	void doSegregate2(int[] a){
		int left = 0;
		int right = a.length -1;
		while(left<right){
			while(left<right && a[left] == 0)
				left++;
			while(left < right && a[right] ==1)
				right--;
			if(left<right){
				a[left++] = 0;
				a[right--] = 1;
			}
		}
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]);
		
	}
}
