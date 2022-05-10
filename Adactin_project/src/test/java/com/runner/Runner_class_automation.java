package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_project.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\Adactin_project\\src\\test\\java\\com\\Adactin_project\\login.feature\\automation.feature",
                        glue = "step",
                        monochrome = true,
                        dryRun = false,
                        strict = true,
                        plugin= {"html:report/cucumberreport","pretty","json:report/cucumber.json"}
                        
                        
                        )

public class Runner_class_automation {

	
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
