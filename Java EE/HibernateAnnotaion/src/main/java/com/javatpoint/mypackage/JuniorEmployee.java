package com.javatpoint.mypackage;

public class JuniorEmployee extends Employee {
	private int trainingPeriod;
	private int performance;
	public JuniorEmployee() {

	}

	public JuniorEmployee(String name, int joinYear,int trainingPeriod, int performance) {
		super(name, joinYear);
		this.trainingPeriod=trainingPeriod;
		this.performance=performance;
	}

	public int getTrainingPeriod() {
		return trainingPeriod;
	}

	public void setTrainingPeriod(int trainingPeriod) {
		this.trainingPeriod = trainingPeriod;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	@Override
	public String toString() {
		return super.toString()+" trainingPeriod=" + trainingPeriod + ", performance=" + performance + "]";
	}


	

}
