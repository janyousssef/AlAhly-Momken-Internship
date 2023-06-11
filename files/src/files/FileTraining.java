package files;

import java.time.*;
import java.util.TimeZone;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id + " " + this.name;
	}

	private void show(int x, float z) {
		System.out.println(id + " " + name + " int: " + x + " float: " + z);
	}
}

public class FileTraining {
	public static void main(String args[]) throws Throwable {
		TimeZone zone = TimeZone.getDefault();  
		   String name = zone.getDisplayName();         
		   System.out.println("Display name for default time zone: "+ name);  
	}
}
