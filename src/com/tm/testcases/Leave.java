package com.tm.testcases;

import com.tm.lib.UserLibrary;

public class Leave extends UserLibrary{
	/*
	 * Class Name : Leave
	 * Description : Main Test scripts for Leave module
	 * Author : Testing Masters
	 * Date Created : 22 Sept 2018
	 * Date Modified : N/A
	 */
	//=========================================
	/*
	 * Test Case Name : TC01_HRMLogin
	 * Description : Verify user is able to login HRM application
	 * Author : Testing Masters
	 * Date Created : 22 Sept 2018
	 * Date Modified : N/A
	 */
	public static void TC01_HRMLogin()
	{
		HRMLogin("user02", "pass1234");
	}
	
	//=========================================
	/*
	 * Test Case Name : TC02_ApplyLeave_VerifyinMyLeave
	 * Description : Verify user is able to apply a leave and same can be cancelled
	 * Author : Testing Masters
	 * Date Created : 22 Sept 2018
	 * Date Modified : N/A
	 */
	public static void TC02_ApplyLeave_VerifyinMyLeave()
	{
		boolean retval;
		
		//Step 1: Launch Application and Login
		HRMLogin("user02", "pass1234");
		
		//Step 2: Navigate to Apply Leave		
		NavApplyLeave();
		
		//Step 3: Apply leave
		ApplyLeave("Personal Leave", "2018-09-28", "2018-09-28", "Sick leave");
		
		
	}
	
	//=========================================
	
	

}
