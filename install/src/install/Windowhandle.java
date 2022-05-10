package install;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	

	

	



	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver  = new ChromeDriver ();

driver.get("http://omayo.blogspot.com/");

String firstwindow= driver.getWindowHandle();

driver.findElement(By.linkText("SeleniumTutorial")).click();

Set<String> allwindows = driver.getWindowHandles();


Iterator<String> itr = allwindows.iterator();


while(itr.hasNext()) {
	String window =itr.next();
	System.out.println(window);
	driver.switchTo().window(firstwindow);
	if (driver.getTitle().equals("Selenium143")) {
	driver.close();
	}
	
}
driver.switchTo().window(firstwindow);


}
	}




