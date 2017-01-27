
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
//		int[] a = {1,2,3,4,5,6};
//		RotateArray r = new RotateArray();
//		r.rotateArray4(a, 3);
		
		//7) Block swap algorithm
		
//		int[] a= {1,2,3,4,5,6,7};
//		BlockSwap b = new BlockSwap();
//		b.blockSwap(a, 2);
		
		//8 Maximum sum such that no two elements are adjacent
		
		//int[] a = {4,1,1,4,2,1};
//		int[] a = {7,3,5,10}; 
//		MaxSumSTNoAdjacent m = new MaxSumSTNoAdjacent();
//		m.findMaxSumNoAdjacent(a);
		
		//int[] a = {16, 17, 4, 3, 5, 2};
		
//		Check for Majority Element in a sorted array
//		Question: Write a function to find if a given integer x appears more than n/2 times in a sorted array of n integers.
		
//		int[] a= {2,3,3,3,4,5,6};
//		MajorityEleInSortedArray m = new MajorityEleInSortedArray();
//		int mid = (0 + a.length-1)/2;
//		int res = m.findMajorityElementInSortedArray2(a,0,a.length-1,a[mid]);
//		if(res != -1 && a[res + mid] == a[res])
//			System.out.println(a[res]);
//		else
//			System.out.println(-1);
//		
//		Segregate 0s and 1s in an array
//		You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.
		
//		int[] a = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//		Segregate0and1 s = new Segregate0and1();
//		s.doSegregate2(a);
		
		
//		int[] a = {2, 3, 10, 6, 4, 8, 1};
//		MaxDiffSTLargerafterSmaller m = new MaxDiffSTLargerafterSmaller();
//		m.findMaxDiffSTLargerAfterSmaller2(a);
		
		//Union and Intersection of two sorted arrays
		//Given two sorted arrays, find their union and intersection.
		
		int[] a = {1, 3, 4, 5, 7,7,7};
		int[] b = {2, 3, 5, 6};
		UnionandIntersection u = new UnionandIntersection();
		u.findUnionandIntersection(a, b);
	}

}
