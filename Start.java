import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.patient.manage.Patient;
import com.patient.manage.PatientDao;

public class Start {


	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Hospital Management");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to Add patient");
			System.out.println("Press 2 to Delete patient");
			System.out.println("Press 3 to display patient");
			System.out.println("Press 4 to update patient");
			System.out.println("Press 5 to exit");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//addpatient
				System.out.println("enter patient name:");
				String name=br.readLine();
			
				System.out.println("enter patient department:");
				String department=br.readLine();
				System.out.println("enter patient diagnosis:");
				String diagnosis=br.readLine();
				System.out.println("enter patient doctorname:");
				String doctorname=br.readLine();
				System.out.println("enter patient fees:");
				String fees=br.readLine();
				
				//create patient object to store patient
				Patient p=new Patient(name,department, diagnosis, doctorname,fees);
				boolean answer=PatientDao.insertPateintToDB(p);
				if(answer)
				{
					System.out.println("patient added successfully");
				}else
				{
					System.out.println("something went wrong try again");
				}
			}
			else if(c==2) {
				//delete pateint
				System.out.println("Enter patient id to delete:");
				int pid=Integer.parseInt(br.readLine());
				boolean f=PatientDao.deletePatient(pid);
				if(f) {
					System.out.println("Deleted");
				}
				else
				{
					System.out.println("Something went wrong");
				}
			}
			else if(c==3)
			{
				//display patient
				PatientDao.showAllPatient();
				
			}
			else if(c==4)
			{
				//update
				
				System.out.println("enter patient fees:");
				String fees=br.readLine();
				System.out.println("enter patient id:");
				int pid=Integer.parseInt(br.readLine());
				
				//create patient object to store patient
				
				boolean answer=PatientDao.updatePateintToDB(fees,pid);
				if(answer)
				{
					System.out.println("patient updated successfully");
				}else
				{
					System.out.println("something went wrong try again");
				}
				
			}
			else
			{
				break;
			}
			
		}
		System.out.println("Thank you for using hospital management");
	}
}
