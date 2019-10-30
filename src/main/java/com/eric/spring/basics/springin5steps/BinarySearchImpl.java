package com.eric.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;		
	}
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		return 3;
	}
}
