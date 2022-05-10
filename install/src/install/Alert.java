package install;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		
		WebElement simple =driver.findElement(By.id("alertButton"));
		
		simple.click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		WebElement alert2 = driver.findElement(By.id("confirmButton"));
		
		alert2.click();
		
		org.openqa.selenium.Alert alert21 = driver.switchTo().alert();
		alert21.accept();
		
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		
		
		org.openqa.selenium.Alert aarumugam = driver.switchTo().alert();
		
		aarumugam.sendKeys("srinivas");
		
		aarumugam.accept();
		
		                                                                                                                                                                  
		
	}
	
	

}