package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

import com.Adactin_project.Baseclass;

import cucumber.api.java.Before;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\Adactin_project\\src\\test\\java\\com\\Adactin_project\\login.feature\\orange.feature", glue = "step", strict = false, monochrome = true, plugin = {
		"html:report/cucumberhtmlreport.html", "pretty", "json:report/cucumber_jason",
		"com.cucumber.listener.ExtentCucumberFormatter:report/file.html" })

public class Runner_orangehml {

	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws InterruptedException {
		driver = Baseclass.getBrowser("chrome");
	}

	@AfterClass
	public static void Teradown() {
		driver.close();
	}
}