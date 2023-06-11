package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "jan")
	private String name;
	@Value(value = "12")
	private int id;
	@Autowired
	private Address adrress;

	public Student() {
	}

	public Student(String name, int id, Address adrress) {
		this.name = name;
		this.id = id;
		this.adrress = adrress;
	}

	public Student(String name) {
		super();
		this.name = name;
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

	public Address getAdress() {
		return adrress;
	}

	public void setAdress(Address adress) {
		this.adrress = adress;
	}

	public String displayInfo() {
		return toString();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adrress=" + adrress + "]";
	}
}