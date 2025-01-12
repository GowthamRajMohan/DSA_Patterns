package io.samcs.streamPractice;

public class Employee {

	private String name;
	private int id;
	private String department;
	private String manager;
	private int age;

	public Employee() {
	}

	public Employee(String name, int id, String department, String manager, int age) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.manager = manager;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int ageDifference(final Employee other) {
		return age - other.age;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", id=" + id +
				", department='" + department + '\'' +
				", manager='" + manager + '\'' +
				", age=" + age +
				'}';
	}
}
