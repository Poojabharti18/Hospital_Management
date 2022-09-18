package com.patient.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientDao {


public static boolean insertPateintToDB(Patient p) {
	boolean f=false;
	try {
		Connection con=ConnectionProvider.createC();
		String q="insert into patients(pname,department,diagnosis,dname,fees)values(?,?,?,?,?)";
		//preparedstatement
		PreparedStatement pstmst=con.prepareStatement(q);
		//set thye valuse of parameter
		pstmst.setString(1, p.getPatientname());
		pstmst.setString(2, p.getDepartment());
		pstmst.setString(3, p.getDiagnosis());
		pstmst.setString(4, p.getDoctorname());
		pstmst.setString(5, p.getFees());
		//execute
		pstmst.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	
}

public static boolean deletePatient(int patientid) {
	boolean f=false;
	try {
		Connection con=ConnectionProvider.createC();
		String q="delete from patients where pid=?";
		//preparedstatement
		PreparedStatement pstmst=con.prepareStatement(q);
		//set thye valuse of parameter
		pstmst.setInt(1, patientid);
	
		//execute
		pstmst.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	
}

public static boolean  showAllPatient() {
	boolean f=false;
	try {
		Connection con=ConnectionProvider.createC();
		String q="select * from patients";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
	
		while(set.next())
		{
			int pid=set.getInt(1);
			String patient_name=set.getString(2);
			String Department=set.getString(3);
			String Diagnosis=set.getString(4);
			String Doctorname=set.getString(5);
			String Fees=set.getString(6);
			
			System.out.println("ID :"+pid);
			System.out.println("Patient_Name :"+patient_name);
			System.out.println("Department:"+Department);
			System.out.println("Diagnosis:"+Diagnosis);
			System.out.println("Doctorname:"+Doctorname);
			System.out.println("Fees:"+Fees);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");


		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	
}

public static boolean updatePateintToDB(String fees,int patientid) {
	boolean f=false;
	try {
		Connection con=ConnectionProvider.createC();
		String q="update Patients set fees=? where pid=?";
		//preparedstatement
		PreparedStatement pstmst=con.prepareStatement(q);
		//set thye valuse of parameter
		pstmst.setString(1,fees);
		pstmst.setInt(2, patientid);
		
		//execute
		pstmst.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
}


}
