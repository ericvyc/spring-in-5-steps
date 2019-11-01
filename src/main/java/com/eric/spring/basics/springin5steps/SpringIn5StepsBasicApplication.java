package com.eric.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eric.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

//		Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		System.out.println(result);
	}

}