
public class MaxDiffSTLargerafterSmaller { 
	/*Method1: keep track of min element and max diff so far
	 * TimeComplexity: O(N)
	 * 
	 * */
	void findMaxDiffSTLargerAfterSmaller(int[] a){
		int max_diff = 0, min = a[0];
		for(int i =1; i<a.length;i++){
			if(a[i] > min){
				int t = a[i] - min;
				if(t>max_diff){
					max_diff = t;
				}
			}
			else
				min = a[i];
		}
		System.out.println(max_diff);
	}
	
	/*Method2: 
	 * 1) build the diff array
	 * 2) apply kadane's algorithm to find max sub array;
	 * 
	 * TimeComplexity: O(N)
	 * Space Complexity: O(N)
	 * */
	void findMaxDiffSTLargerAfterSmaller2(int[] a){
		int[] diff = new int[a.length-1];
		for(int i = 1; i<a.length;i++){
			diff[i-1] = a[i]-a[i-1];
		}
		int max_so_far = diff[0],curr_max = diff[0];
		for(int i = 1; i<diff.length;i++){
			if(diff[i] > curr_max + diff[i]){
				curr_max = diff[i];
			}
			else
				curr_max = curr_max + diff[i];
			if(max_so_far < curr_max)
				max_so_far = curr_max;
		}
		System.out.println(max_so_far);
	}

}
