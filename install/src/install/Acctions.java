package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acctions {

	

	
	

	private static WebElement findElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver ();

driver.get("https://play.letcode.in/contextmenu");

driver.manage().window().maximize();


WebElement find = driver.findElement(By.className("mat-list-item-content"));

Actions builder = new Actions (driver);

builder.contextClick(find).perform();   // right click

driver.findElement(By.xpath("//button[@tabindex='0']")).click();

org.openqa.selenium.Alert alt = driver.switchTo().alert();

alt.accept();

		
		
		



	}

}
