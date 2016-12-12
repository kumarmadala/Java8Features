package com.java8.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreaming {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		// using lambda with Stream API, filter example
		Stream<Integer> parallel = parallelStream.filter(num -> (num > 30 && num < 45));
		// using lambda in forEach
		parallel.forEach(p -> System.out.println("Boundary values=" + p));

		Stream<Integer> sequence = sequentialStream.filter(n -> (n>30 && n<50));
		sequence.forEach(p -> System.out.println("sequential values=" + p));

	}

}