package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_project.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin_project\\login.feature\\adactin.feature",
                  glue ="step.Step_def_adactin",
                  plugin = "html:report/cucum")

public class Run_adactin {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = Baseclass.getBrowser("chrome");
	}

	@AfterClass
	public static void teardown() {
		driver.close();

	}
}