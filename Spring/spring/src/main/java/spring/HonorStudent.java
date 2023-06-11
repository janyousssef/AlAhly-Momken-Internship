package spring;

import java.util.Map;

public class HonorStudent extends Student {
	private int rank;
	private Address adrress;
	private Map<String,Integer> subjects;
	public HonorStudent() {
		super();
	}

	public HonorStudent(String name, int id, Address adrress, int rank) {
		super(name, id, adrress);
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "HonorStudent [rank=" + rank + ", adrress=" + adrress + ", subjects=" + subjects + "]";
	}

	public Address getAdrress() {
		return adrress;
	}

	
	public void setAdrress(Address adrress) {
		this.adrress = adrress;
	}


	public Map<String,Integer> getSubjects() {
		return subjects;
	}


	public void setSubjects(Map<String,Integer> subjects) {
		this.subjects = subjects;
	}

	

}
