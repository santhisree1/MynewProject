package com.tm.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class UserLibrary extends WebLibrary{
	
	public static void HRMLogin(String userid, String passwd)
	{
		boolean retval;
		//Launch Application
		launchApp("http://testingmasters.com/hrm/");
		
		//Verify login page opened
		retval = verifyText("div","LOGIN Panel");
		if(retval)
			System.out.println("Login page displayed");
		else
			System.out.println("Login page not displayed");
		
		//Step 1: Enter user id
		retval = setText("//input[@id='txtUsername']", userid);
		if(retval)
			System.out.println("User id entred");
		else
			System.out.println("User id not entred");
		
		//Step 2: Enter password
		retval = setText("//input[@id='txtPassword']", passwd);
		if(retval)
			System.out.println("password entred");
		else
			System.out.println("password not entred");
		
		//Step 3: Click on Login button 		
		retval = clickButton("//input[@id='btnLogin']");
		if(retval)
			System.out.println("Login button clicked");
		else
			System.out.println("Login button not clicked");
		
		//Step 4: Verify home page displayed 		
		retval = verifyText("h1","Dashboard");
		if(retval)
			System.out.println("Home page displayed");
		else
			System.out.println("Home page not displayed");
	}
	
	//==========================================================
	
	public static void NavApplyLeave()
	{
		Actions obj = new Actions(driver);
		obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
				
		clickLink("//a[@id='menu_leave_applyLeave']","Apply");
		
		boolean retval = verifyText("h1", "Apply Leave");
		if(retval)
			System.out.println("Apply Leave page displayed");
		else
			System.out.println("Apply Leave page not displayed");		
	}
	
	//==========================================================
	
		public static void ApplyLeave(String LeaveType, String stDate, String endDate, String comment)
		{		
			boolean retval;
			//Select leave type			
			retval = selectItemwithText("applyleave_txtLeaveType", LeaveType);
			if(retval)
				System.out.println("Leave type seelcted");
			else
				System.out.println("Leave type not selected");
			
			//Enter from date
			retval = setText("//input[@id='applyleave_txtFromDate']", stDate);
			if(retval)
				System.out.println("From date entered");
			else
				System.out.println("From date not entered");
			
			//Enter from date
			retval = setText("//input[@id='applyleave_txtToDate']", endDate);
			if(retval)
				System.out.println("To date entered");
			else
				System.out.println("To date not entered");
			
			//Enter comment
			retval = setText("//textarea[@id='applyleave_txtComment']", comment);
			if(retval)
				System.out.println("Comment entered");
			else
				System.out.println("Comment not entered");
			
			//click Apply
			retval = clickButton("//input[@id='applyBtn']");
			if(retval)
				System.out.println("Apply button clicked");
			else
				System.out.println("Apply button not clicked");
		}

}
