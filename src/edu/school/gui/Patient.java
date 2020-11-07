package edu.school.gui;

public class Patient {
	private String name;
	private int patientNumber;
	private boolean isTested;
	
	public Patient(String n, int pn, boolean it) {
		if(n != null && !n.isEmpty()) {
			name = n;
		}
		patientNumber = pn;
		isTested = it;
	}
	
	public String toString() {
		String result = name +", " + patientNumber;
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPatientNumber() {
		return patientNumber;
	}
	
	public boolean isTested() {
		return isTested;
	}
}
