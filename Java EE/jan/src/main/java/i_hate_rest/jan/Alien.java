package i_hate_rest.jan;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
private String name;
private int age,id;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
