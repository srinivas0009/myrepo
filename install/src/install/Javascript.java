package install;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Throwables;
import com.sun.glass.events.KeyEvent;

import jdk.jfr.events.ThrowablesEvent;
import oracle.jrockit.jfr.jdkevents.ThrowableTracer;

public class Javascript {



	

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver ();

driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

JavascriptExecutor script = (JavascriptExecutor) driver;

//script.executeScript("window.scrollBy(0,2000);");  // scrolldown

//script.executeScript("window.scrollBy(0,-4500);");  // scrollup

//WebElement web= driver.findElement(By.xpath("(//img[@height='200px'])[1]"));

//script.executeScript("arguments[0].scrollIntoview();",web);

Robot rob = new Robot ();

rob.keyPress(KeyEvent.VK_DOWN);
rob.keyRelease(KeyEvent.VK_DOWN);

rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);



	}

}
