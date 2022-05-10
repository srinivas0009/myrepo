package com.testng;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_annotation {

	@BeforeSuite
	private void setproperty() {
		System.out.println("setproperty");
	}

	@BeforeTest
	private void launchbrowser() {
		System.out.println("launch browser");
	}

	@BeforeClass
	private void launchurl() {
		System.out.println("launchurl");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test(priority = 0,enabled = false)
	private void flikart() {
		System.out.println("flikart");
	}

	@Test(priority = 1)
	private void amazon() {
		System.out.println("amazon");
	}

	@Test(priority = -1, invocationCount = 3)
	private void mesho() {
		System.out.println("mesho");
	}
@Ignore
	@Test
	private void zomato() {
		System.out.println("zomato");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void homepage() {

	}

	@AfterTest
	private void closebrowser() {
	}

	@AfterSuite
	private void deletall() {
		System.out.println("delet all cookies");
	}

}
