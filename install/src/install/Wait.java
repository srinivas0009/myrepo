package install;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {


	

	

	

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://letcode.in/waits");


//alertispresent
//WebElement user = driver.findElement(By.id("accept"));

//user.click();

WebDriverWait wait = new WebDriverWait(driver,30);

//Alert until = wait.until(ExpectedConditions.alertIsPresent());
//until.accept();


//inisibility

driver.get("https://letcode.in/signin");

driver.findElement(By.name("email")).sendKeys("srinivastheengineer@gmail.com");

driver.findElement(By.name("password")).sendKeys("nallapassword@12");

driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));

wait.until(ExpectedConditions.invisibilityOf(toast));

driver.findElement(By.linkText("sign out")).click();


	
	
	}

}
