package com.tm.driver;

import com.tm.testcases.Leave;

public class TestRunner extends Leave{

	public static void main(String[] args) {
		//Execute test cases
		TC01_HRMLogin();
		TC02_ApplyLeave_VerifyinMyLeave();
	}

}
