import java.util.ArrayList;

public class UnionandIntersection {
	void findUnionandIntersection(int[] a,int[] b){
		//union
		int i=0,j=0,k=0;
		ArrayList<Integer> union = new ArrayList<Integer>();
		while(i < a.length && j < b.length){
			if(a[i] < b[j])
				union.add(a[i++]);
			else if(b[j] < a[i])
				union.add(b[j++]);
			else{
				union.add(a[i++]);
				j++;
			}
		}
		while(i<a.length && j == b.length){
			if(a[i] != a[i-1])
				union.add(a[i++]);
			else
				i++;
		}
		while(j<b.length-1 && i == a.length){
			if(b[j] != b[j-1])
				union.add(b[j++]);
			else
				j++;
		}
		for(Integer p:union)
			System.out.println(p);
		
		//Intersection
		i =0; j =0;
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		while(i<a.length && j<b.length){
			if(a[i] < b[j])
				i++;
			else if(b[j] < a[i])
				j++;
			else{
				intersection.add(a[i++]);
				j++;
			}		
		}
		System.out.println("Intersection is:: ");
		for(Integer x:intersection)
			System.out.println(x);
		
	}
}
