
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Given an array A[] and a number x, check for pair in A[] with sum as x
		/*
		int[] a= {1, 4, 45, 6, 10, 8};
		int n = 16;
		CheckPairSumX c = new CheckPairSumX();
		System.out.println(c.findPairwithX_2(a, n));
		*/
		
		//2) Find majority element in an array
		
		/*int[] a = {4,7,4,4,7,9,4,3};
		MajorityElement e = new MajorityElement();
		System.out.println(e.findMajorityElement2(a));
		*/
		
		//3) Find the Number Occurring Odd Number of Times
		/*
		int[] a = {1, 2, 3, 2, 3, 1};
		NumOccuringOddNumTimes n = new NumOccuringOddNumTimes();
		int x = n.findNumOccuringOddNumTimes(a);
		System.out.println(x);
		*/
		
		//4)Merge an array of size n into another array of size m+n
		/*
		int[] a = {2,-1,7,-1,-1,10,-1};
		int[] b = {5,8,12,14};
		MergeArraysWithoutExtraSpace m = new MergeArraysWithoutExtraSpace();
		a = m.mergeSortedArrays(a, b);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
		*/
		
		//5) Write a program to reverse an array or string
		/*
		int[] a ={1,2,3,4,5,6,7};
		ReverseArray r = new ReverseArray();
		r.reverseArray2(a,0,a.length-1);
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		//6) Program for array rotation
		int[] a = {1,2,3,4,5,6};
		RotateArray r = new RotateArray();
		r.rotateArray4(a, 3);
		
	}

}
