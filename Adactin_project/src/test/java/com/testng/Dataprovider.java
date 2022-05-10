package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	
	

	@Test(dataProvider = "testdata")
	private void credential(String uname,String pass) {
		System.out.println(uname);
		System.out.println(pass);

	}
@DataProvider
	@Test
	private Object[][] testdata() {
		return new Object [][] {
             
			{"admin","admin123",},
			{"root","root123"},
			{"boot","boot123","boot123"}// throws method mismatch exception
	};
	
}
}