package in.randip;

public class Employee {
	private String firstName;
	private String lastName;
	//static private String emailPrimarydomain = "abc.com";
	private String userEmail;
	private String department;
	private String deptDomain;
	private String userPassword;


	// Default constructor with Firstname and Lastname of employee
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	/*
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 */


	public String getLastName() {
		return lastName;
	}

	/*
	 * public void setLastName(String lastName) { this.lastName = lastName; }
	 */


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}



	public String getDeptDomain() {
		return deptDomain;
	}



	public void setDeptDomain(String deptDomain) {
		this.deptDomain = deptDomain;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



}
