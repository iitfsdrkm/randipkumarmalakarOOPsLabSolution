package in.randip;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int choice;
		Scanner input = new Scanner(System.in);
		
		Employee emp1 = new Employee("Harshit","Choudary");  // Sample hardcoded value for Employee 
		
		do {
			
		choice=0;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		choice = input.nextInt();
		if(choice <1 || choice >4)
			System.out.println("==========Error : Incorrect choice !===========");
		
		} while(choice<1 || choice >4);
					
		switch(choice) {
		case 1:
			emp1.setDepartment("Technical");	// Set Technical Department name
			emp1.setDeptDomain("tech");			// Set Domain name for Technical Department
			break;
		case 2:
			emp1.setDepartment("Admin");		// Set Admin Department name
			emp1.setDeptDomain("admin");		// Set Domain name for Admin Department
			break;
		case 3:
			emp1.setDepartment("Human Resource");	// Set Human Resource Department name
			emp1.setDeptDomain("hr");				// Set Domain name for Human Resource Department
			break;
		case 4:
			emp1.setDepartment("Legal");		// Set Legal Department name
			emp1.setDeptDomain("legal");		// Set Domain name for Legal Department
			break;
		default:
			break;
		}
		
		input.close();
				
		/*
		System.out.println(emp1.getDepartment());
		System.out.println(emp1.getFirstName() + " " + emp1.getLastName());
		System.out.println(emp1.getDeptDomain());
		*/
		
		CredentialService credentialService = new CredentialService(emp1);
		credentialService.generateEmailAddress();
		
		//System.out.println(emp1.getUserEmail());
		//System.out.println("--------------------");
		
		credentialService.generatePassword();
		credentialService.showCredentials();
		
	}
}

