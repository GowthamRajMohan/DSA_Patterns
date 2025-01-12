package io.samcs.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPractice {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi", "orange");
		List<Integer> integers = Arrays.asList(3,4,6,7,18,9,2,10,7);
//		System.out.println(strings.stream()
//				.mapToInt(String::length)
//				.filter(l-> l>5)
//				.count());
		StringBuilder res = new StringBuilder();
		String s = "abc";
		s.toCharArray();
		System.out.println(integers.stream()
				.mapToInt(Integer::intValue)
						.peek(System.out::println)
				.max()
				.getAsInt());

	}

	public List<Integer> squareRoot(List<Integer> numbers) {
		return numbers.stream()
				.map(num -> num * num)
				.collect(Collectors.toList());
	}
}
