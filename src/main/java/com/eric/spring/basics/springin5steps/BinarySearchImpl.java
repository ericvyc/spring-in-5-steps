package com.eric.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	SortAlgorithm bubbleSortAlgorithm;
//	SortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;		
//	}

//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//	this.sortAlgorithm = sortAlgorithm;
//}
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		//Search the array
		return 3;
	}
}
