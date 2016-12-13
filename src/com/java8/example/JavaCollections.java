package com.java8.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JavaCollections {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 100; i > 0; i--)
			myList.add(i);

		// traverse using Iterator
		Iterator<Integer> iterator = myList.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println("Iterator Value::" + i);
		}

		// traverse through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("forEach anonymous class Value::" + i);
			}
		});

		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}
}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.println("Consumer implementation Value::" + i);
	}
}