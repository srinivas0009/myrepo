package install;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https:facebook.com");

driver.manage().window().maximize();

TakesScreenshot ts = (TakesScreenshot) driver;

File src =  ts.getScreenshotAs(OutputType.FILE);

File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\install\\Screenshot\\Fb.png");

FileUtils.copyFile(src, dest);

	}

}
