package com.eric.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// Bubble sort logic
		return numbers;
	}

}
