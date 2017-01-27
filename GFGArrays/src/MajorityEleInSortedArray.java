
public class MajorityEleInSortedArray {
	
	/*Method 1: using Linear Search loop through each element and check if i+n/2 is having same value
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * 
	 * */
	int findMajorityElementInSortedArray1(int[] a){
		int l = a.length;
		for(int i =0;i<a.length;i++){
			int temp = i+(l/2);
			if(temp < l && a[temp] == a[i]){
				return a[i];
			}
		}
		return -1;
	}
	
	
	/*Method2: using Binary Search. if there is any majority element present in an array it should be at the middle because 
	 * it should be more than half of the array length
	 * 
	 * Time Complexity: O(LogN)
	 * */
	int findMajorityElementInSortedArray2(int[] a, int l, int h, int x){
		if(h>=l){
			int m = (l + h)/2;
			if((m==0 || a[m-1] < x) && a[m] == x)
				return m;
			else if(x > a[m])
				return findMajorityElementInSortedArray2(a,m+1,h,x);
			else
				return findMajorityElementInSortedArray2(a,l,m-1,x);
		}
		return -1;
	}
}
