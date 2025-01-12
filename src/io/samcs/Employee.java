package io.samcs;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Employee {

	public static void main(String[] args) {
		Method[] declaredMethods = Employee.class.getDeclaredMethods();
		Arrays.stream(declaredMethods).map(method -> method.getName()).forEach(System.out::println);
	}

	public String function1() {
		return "";
	}
}
