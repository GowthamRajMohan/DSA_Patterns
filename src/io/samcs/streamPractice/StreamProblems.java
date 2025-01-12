package io.samcs.streamPractice;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblems {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		double average = numbers.stream().mapToDouble(x -> x).average().orElse(0.0);
//		System.out.println(average);
//		System.out.println(6%5);

		List<String> names = List.of("Sam", "John", "Doe", "Jane", "Doe", "Sam");
//		names.stream().map(String::toUpperCase).forEach(System.out::println);
//		int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
//		int oddSum = numbers.stream().filter(n -> !(n % 2 == 0)).mapToInt(Integer::intValue).sum();
//		System.out.println(evenSum +" - "+ oddSum);
//		List<String> uniqueNames = names.stream().distinct().toList();
//		uniqueNames.forEach(System.out::println);
//		long sCount = names.stream().filter(s -> s.toLowerCase().startsWith("s")).count();
//		System.out.println(sCount);
//		Stream<String> sorted = names.stream().sorted();
//		sorted.forEach(System.out::println);
//		int max= numbers.stream().max(Integer::compare).orElse(-1);
//		System.out.println(max);
//		int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
//		System.out.println(min);
//		numbers.stream().max(Integer::compareTo);
//		List<Integer> a = new ArrayList<>();
//		List.of(2,4,4,6,8,12);

		List<Employee> employees = List.of(
				new Employee("Gowtham", 1, "Dev", "xyx", 31),
				new Employee("Gundu", 2, "QA", "xyz", 31),
				new Employee("Nivash", 3, "Dev", "xyx", 25),
				new Employee("Sathish", 4, "Devops", "xxx", 27),
				new Employee("Azar", 5, "Dev", "xyx", 29));
//
//		Comparator<Employee> sortByAgeAscending = (employee1, employee2) -> employee1.ageDifference(employee2);
		Comparator<Employee> sortByAgeAscending = (employee1, employee2) -> employee1.getAge()- employee2.getAge();

//		System.out.println(Math.(Integer.MIN_VALUE));
//		System.out.println(employees.stream()
//				.sorted(sortByAgeAscending.reversed())
//				.collect(Collectors.toList()));
//
		Map<Integer, List<String>> employeesSortedByAge = employees.stream()
				.sorted(sortByAgeAscending.reversed())
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(employeesSortedByAge);
//
//				employees
//				.stream()
//				.min(Employee::ageDifference)
//						.ifPresent(youngest -> System.out.println("Youngest: " + youngest.getName()));
//
//				employees
//				.stream()
//				.max(Employee::ageDifference)
//						.ifPresent(youngest -> System.out.println("oldest: " + youngest.getName()));
//
//		Function<Employee,String> byName = employee -> employee.getName();
//		Function<Employee,Integer> byAge = employee -> employee.getAge();
//
//
//		System.out.println(employees.stream()
//				.sorted(Comparator.comparing(byName).thenComparing(byAge))
//				.collect(Collectors.toList()));
//
//		Comparator<Employee> employeeAge = Comparator.comparingInt(Employee::getAge);
//		Map<Character, Optional<Employee>> oldestEmployeeOfEachLetter = employees.stream()
//				.collect(Collectors.groupingBy(employee -> employee.getName().charAt(0),
//						Collectors.reducing(BinaryOperator.maxBy(employeeAge))));
//		System.out.println(oldestEmployeeOfEachLetter);


//		Employee e1 = new Employee("Gowtham", 1, "Dev", "xyx", 31);
//		Employee e2 = new Employee("Gundu", 2, "QA", "xyz", 30);
//		Employee e3 = new Employee("Nivash", 3, "Dev", "xyx", 25);
//		Employee e4 = new Employee("Sathish", 4, "Devops", "xxx", 27);
//		Employee e5 = new Employee("Azar", 5, "Dev", "xyx", 29);
//
//		List<Employee> modifiableEmployees = new ArrayList<>();
//		modifiableEmployees.add(e1);
//		modifiableEmployees.add(e2);
//		modifiableEmployees.add(e3);
//		modifiableEmployees.add(e4);
//		modifiableEmployees.add(e5);
//		System.out.println("Before sorting : " + modifiableEmployees);
//		Collections.sort(modifiableEmployees,new AgeComparator());
//		System.out.println("After sorting : " + modifiableEmployees);

//		System.out.println("Longest String: " + names.stream().mapToInt(String::length).max().orElse(0));
//		System.out.println("Longest String: " + names.stream().max(Comparator.comparingInt(String::length)));
//		double averageAge = employees.stream()
//				.mapToInt(Employee::getAge)
//				.average()
//				.orElse(0.0);
//
//		System.out.println("average age: " + averageAge );



	}
}
