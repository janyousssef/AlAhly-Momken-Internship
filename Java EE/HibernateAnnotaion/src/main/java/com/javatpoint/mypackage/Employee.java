package com.javatpoint.mypackage;

public class Employee {
	private int id;
	private String name;
	private int joinYear;

	public Employee() {
	}

	public Employee(String name, int joinYear) {
		this.name = name;
		this.joinYear = joinYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJoinYear() {
		return joinYear;
	}

	public void setJoinYear(int joinYear) {
		this.joinYear = joinYear;
	}

	@Override
	public String toString() {
		if (Employee.class.getSimpleName()==getClass().getSimpleName()) 
		return "Employee [id=" + id + ", name=" + name + ", joinYear=" + joinYear + "]";
		else return getClass().getSimpleName()+ " [id=" + id + ", name=" + name + ", joinYear=" + joinYear;
	}

}