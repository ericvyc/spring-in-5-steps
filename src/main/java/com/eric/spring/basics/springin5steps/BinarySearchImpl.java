package com.eric.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;		
//	}

//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//	this.sortAlgorithm = sortAlgorithm;
//}
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search the array
		return 3;
	}
}
