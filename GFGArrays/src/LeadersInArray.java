
public class LeadersInArray {
	
	//Method 1: Naive Approach
	/*
	 *for each element check if the element is greater than all elements right to it
	 *
	 * Time Complexity: O(N*N)
	 * Space Complexity: 
	 * */
	void findLeadrsInArray1(int[] a){
		int n = a.length;
		boolean flag = true;
		for(int i =0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i] < a[j]){
					flag = false;  
				}
			}
			if(flag != false){
				System.out.println(a[i]);
			}
		}
	}
	
	//Method2: get the max from right side
	/*
	 *Time Complexity: O(N) 
	 */
	void findLeadrsInArray2(int[] a){
		int n = a.length;
		System.out.println(a[n-1]);
		int max = a[n-1];
		for(int i = n-2; i>=0 ; i--){
			if(a[i] < max){
				max = a[i];
				System.out.println(a[i]);
				
			}
		}
	}
}
