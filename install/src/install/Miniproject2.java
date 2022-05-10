package install;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miniproject2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("srinivastheengineer@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("nallapassword@12");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]")).click();
		
		driver.findElement(By.id("add_to_cart")).click();
  
}
  

		
		
		}
			
		
				
				
				
				
				
				
				
				
				
				
				
				
				
			
