package in.randip;

public class CredentialService {
	static private String emailPrimarydomain = "abc.com";
	private Employee emp;



	public CredentialService(Employee emp) {
		super();
		this.emp = emp;
	}

	public void generatePassword() {

		char alphabetLower[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char alphabetUpper[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//char specialChar[] = {'!','#','$','%','&','(',')','*','+','-'};
		char specialChar[] = {'!','#','$','&','*','(',')','%'}; // Add or remove special characters as per requirement
		char numberArray[] = {'0','1','2','3','4','5','6','7','8','9'};

		int passwordLength=8; // Specify the length of the password the program should generate
		int randomValue;
		int i=0;

		StringBuilder myPassword = new StringBuilder();
		boolean passwordHasLowerCase=false;
		boolean passwordHasUpperCase=false;
		boolean passwordHasSpecialChar=false;
		boolean passwordHasNumber=false;
		int totalPass=0;

		/*
		int len=specialChar.length;
		System.out.println("Special characters array size: " + len);
		len=numberArray.length;
		System.out.println("Number Array size: " + len);
		len=alphabetLower.length;
		System.out.println("Upper Alphabet array size: "+len);
		len=alphabetUpper.length;
		System.out.println("Lower Alphabet array size: " + len);
		 */

		do {
			passwordHasLowerCase=false;
			passwordHasUpperCase=false;
			passwordHasSpecialChar=false;
			passwordHasNumber=false;
			i=0;
			myPassword.setLength(0);

			do {
				randomValue=getRandom(4);

				//System.out.println("Random Value : "+ randomValue);

				if(randomValue==0) {
					myPassword.append(alphabetLower[getRandom(alphabetLower.length)]);
					passwordHasLowerCase=true;
				}
				if(randomValue==1) {
					myPassword.append(alphabetUpper[getRandom(alphabetUpper.length)]);
					passwordHasUpperCase=true;
				}
				if(randomValue==2) {
					myPassword.append(specialChar[getRandom(specialChar.length)]);
					passwordHasSpecialChar=true;
				}
				if(randomValue==3) {
					myPassword.append(numberArray[getRandom(numberArray.length)]);
					passwordHasNumber=true;
				}


				i++;
			} while(i<passwordLength);

			totalPass++;

			//System.out.println("Number of iterations made to generate the random password : " + totalPass);

		} while(!(passwordHasLowerCase && passwordHasUpperCase && passwordHasSpecialChar && passwordHasNumber)); // conditions to check if password contains all the required elements.

		//System.out.println(getRandom(4));
		//System.out.println("Final Generated Passord after :" + totalPass + " : " + myPassword);

		emp.setUserPassword(myPassword.toString());

	}


	public static int getRandom(int max) {

		// Generate random number between 0 to max int value

		return (int) (Math.random()*max);


	}


	public void generateEmailAddress() {

		// Generate Email address with Firstname + Lastname @ Department Domain + Company Domain name

		emp.setUserEmail(emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDeptDomain() + "." + emailPrimarydomain);

	}

	public void showCredentials() {

		// Displays Users Generated Email and Password

		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --> " + emp.getUserEmail());
		System.out.println("Password --> " + emp.getUserPassword());

	}

}
