import java.util.Hashtable;
import java.util.Map.Entry;

public class NumOccuringOddNumTimes {
	
	/*
	 * Given an array of positive integers. 
	 * All numbers occur even number of times except one number which occurs odd number of times. 
	 * Find the number in O(n) time & constant space.
	 * */
	
	//Method 1: Use Hashtable to store to count number of occurances of a number
	
	int findNumOccuringOddNumTimes(int[] a){
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i =0; i<a.length;i++){
			table.compute(a[i], (key,val)-> {
				if(val == null)
					return 1;
				else
					return val + 1;
				
			});
		}
		for(Entry<Integer,Integer> entry: table.entrySet()){
			if(entry.getValue() %2 == 1){
				return entry.getKey();
			}
		}
		return -1;
	}
	
	
	//Method:2 Using Bitwise XOR operation for the array
	
	int findNumOccuringOddNumTimes2(int[] a){
		int res = 0;
		for(int i=0;i<a.length;i++){
			res = res ^ a[i];
		}
		return res;
	}
}
