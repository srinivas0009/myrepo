package com.testng;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assetsandretry {
	
	
@Test(retryAnalyzer = Retry_class.class)
	private void uname() {
	String expected = "baba";
	String actual= "baba";
Assert.assertEquals(actual, expected);
}






@Test(retryAnalyzer = Retry_class.class)
private void password() {
	String expected = "password";
String actual="password123";
Assert.assertEquals(actual, expected);
}
}
