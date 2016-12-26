
public class MergeArraysWithoutExtraSpace {
	/* Question:
		There are two sorted arrays. First one is of size m+n containing only m elements. 
		Another one is of size n and contains n elements. 
		Merge these two arrays into the first array of size m+n such that the output is sorted. */
	int[] mergeSortedArrays(int[] a,int[] b){
		a = pushElementsToEnd(a);
		int i = b.length, j = 0, k = 0,len = a.length;
		while(i < a.length && j < b.length){
			if(i < a.length && a[i] < b[j])
				a[k++] = a[i++];
			else
				a[k++] = b[j++];
		}
		if(i == a.length){
			while(j<b.length){
				a[k++] = b[j++];
			}
		}
		if(j == b.length){
			while(i<a.length)
				a[k++] = b[i++];
		}
		return a;
	}
	int[] pushElementsToEnd(int[] a){
		int j = a.length-1;
		for(int i= a.length -1; i>=0;i--){
			if(a[i] != -1)
				a[j--] = a[i];
		}
		return a;
	}
}
