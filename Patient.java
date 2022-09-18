package com.patient.manage;

public class Patient {
	private int patientid;
	private String patientname;
	private String department;
	private String diagnosis;
	private String doctorname;
	private String fees;
	
	
	public Patient(String patientname, String department, String diagnosis, String doctorname, String fees) {
		super();
		this.patientname = patientname;
		this.department = department;
		this.diagnosis = diagnosis;
		this.doctorname = doctorname;
		this.fees = fees;
		
	}
	public Patient() {
		super();
		
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", patientname=" + patientname + ", department=" + department
				+ ", diagnosis=" + diagnosis + ", doctorname=" + doctorname + ", fees=" + fees +  "]";
	}
   

	
}
