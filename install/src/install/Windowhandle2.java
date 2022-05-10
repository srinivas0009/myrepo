package install;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Windowhandle2 {



	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

Actions act = new Actions(driver);
WebElement mob = driver.findElement(By.linkText("Mobiles"));

act.contextClick(mob).build().perform();

Robot rob = new Robot();

rob.keyPress(KeyEvent.VK_DOWN);
rob.keyPress(KeyEvent.VK_ENTER);

String window1= driver.getWindowHandle();
System.out.println(window1);


Set<String> window2 = driver.getWindowHandles();
String s2="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
for (String str: window2) {
	String title = driver.switchTo().window(str).getTitle();
	System.out.println(title);
	
	
	if (driver.switchTo().window(window1).getTitle().equals(s2)) {
		System.out.println("done");
	}
	
	
	
	
}

	}

}