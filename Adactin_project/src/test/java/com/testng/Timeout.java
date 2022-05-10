package com.testng;

import org.testng.annotations.Test;

public class Timeout {
	
@Test(timeOut = 10000)
	private void credential() throws InterruptedException {
		System.out.println("username");
		Thread.sleep(4000);
		System.out.println("password");
		Thread.sleep(1000);
		System.out.println("submit");

	}
@Test(expectedExceptions = ArithmeticException.class)
private void zeroerror() {
	int a = 1/0;
	System.out.println(a);
}


}
