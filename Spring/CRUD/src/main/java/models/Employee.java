package models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Employee {
private int id;
@NonNull
@Size(min = 3, max = 20,message = "name too short or too long")
@Pattern(regexp = "[a-zA-Z]+" , message = "chars only")
private String name;
@NonNull
@Max(value = 100000, message = "salary can't be higher than 100k")
@Min(value = 2000,message = "salary can't be lower than 2000")
private float salary;
@NonNull
private String job;
public Employee() {
	super();
}
public Employee(int id, String name, float salary, String job) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.job = job;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}

}
