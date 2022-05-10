package com.Adactin_project;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver; // null pointer
	
	public static void clickbutton(WebElement element) {
		// TODO Auto-generated constructor stub
		element.click();
	}
		public static void inputText(WebElement element1,String value) {
			element1.sendKeys(value);
		}
		
		
		public static WebDriver getBrowser(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new FirefoxDriver();
			}	
				driver.manage().window().maximize();
				return driver;
		}
			public static void geturl(String url) {
				  driver.get(url);
			}
			public static void close () {
				driver.close();
			}
			public static void dropdown(WebElement element,String type,String v) {
				Select s = new Select (element);
			if (type.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(v);
			}
			else if (type.equalsIgnoreCase("Byvalue"))	{
				s.selectByValue(v);
			}
			
			else if (type.equalsIgnoreCase("Byindex")) {
				int i = Integer.parseInt(v);//string to int
				s.selectByIndex(i);
			}		
			}
			public static void thuungu() throws InterruptedException {
				Thread.sleep(3000);
			}
			
			public static void screenshot() throws IOException {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\install\\Screenshot\\path.png");
				FileUtils.copyFile(src, dest);
			}
				
			}
			
			
		
	


