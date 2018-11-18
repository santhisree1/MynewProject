package WebDriverEx;

import com.tm.lib.WebLibrary;

public class TC01_FecebookReg extends WebLibrary{

	
	public static void main(String[] args) {
		
		boolean bValue;
		
		//open application
		launchApp("https://www.facebook.com/");		
		
		//verify create account page displayed
		bValue = verifyText("span", "Create an account");		
		if(bValue)	
			System.out.println("Facebook account craetion page displayed");		
		else		
			System.out.println("Facebook account craetion page not displayed");
		
		//Enter first name
		bValue = setText("//input[@name='firstname']", "Testing");			
		if(bValue)
			System.out.println("First name entered");
		else
			System.out.println("First name not entered");
		
		//Enter last name
		bValue = setText("//input[@name='lastname']", "Masters");			
		if(bValue)
			System.out.println("Last name entered");
		else
			System.out.println("Last name not entered"); 

		//Enter Mobile number
		bValue = setText("//input[@name='reg_email__']", "87900634665");			
		if(bValue)
			System.out.println("Mobile number entered");
		else
			System.out.println("Mobile number not entered"); 
		
		//Enter Enter password
		bValue = setText("//input[@name='reg_passwd__']", "pass1234");			
		if(bValue)
			System.out.println("password entered");
		else
			System.out.println("password not entered");
				
		//Select DOB
		bValue = selectItemwithText("day", "15");
		if(bValue)
			System.out.println("Date is selected");
		else
			System.out.println("date is not selected"); 
		
		//Month
		bValue = selectItemwithText("month", "Dec");
		if(bValue)
			System.out.println("Month is selected");
		else
			System.out.println("Month is not selected");
		
		//Year
		bValue = selectItemwithText("year", "2015");
		if(bValue)
			System.out.println("Year is selected");
		else
			System.out.println("Year is not selected");		
		

	}

}
