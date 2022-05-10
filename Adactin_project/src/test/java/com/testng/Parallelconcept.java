package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelconcept {
@Test
	private void leafground() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Adactin_project\\drivernew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
@Test
	private void flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Adactin_project\\drivernew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
