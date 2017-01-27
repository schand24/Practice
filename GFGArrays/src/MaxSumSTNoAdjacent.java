
public class MaxSumSTNoAdjacent {
	
	void findMaxSumNoAdjacent(int[] a){
		int len = a.length;
		System.out.println(len);
		int[] incl = new int[len];
		int[] exc = new int[len];
		incl[0] = a[0];
		exc[0] = 0;
		for(int i = 1; i<len;i++ ){
			incl[i] = Math.max(incl[i-1], exc[i-1]+a[i]);
			//System.out.println("incl[i] :: "+incl[i]);
			exc[i] = incl[i-1];
			//System.out.println("Exc[i] :: "+exc[i]);
		}
		System.out.println(incl[len-1]);
		int[] t = new int[len];
		t[len-1] = incl[len-1]> incl[len-2]+exc[len-2]?0:1;
		for(int i = len-1;i>0;i--){
			if(incl[i-1] > exc[i-1] + a[i] && t[i]!=1)
				t[i-1] = 1;
		}	
		for(int i = 0;i<len;i++){
			System.out.println(t[i]);
		}
		
	}

}
