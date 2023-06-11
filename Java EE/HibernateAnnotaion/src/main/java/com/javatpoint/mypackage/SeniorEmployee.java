package com.javatpoint.mypackage;

public class SeniorEmployee extends Employee {
private int bonus;
private int experience;

public SeniorEmployee() {

}
public SeniorEmployee(String name, int joinYear,int bonus,int experience) {
	super(name, joinYear);
	this.bonus=bonus;
	this.experience=experience;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return super.toString()+" bonus=" + bonus + ", experience=" + experience + "]";
}

}
