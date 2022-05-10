package install;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {



	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

	
	WebDriver obj = new ChromeDriver();
	
	
	obj.get("https://www.amazon.in/");
	
	obj.navigate().to("https://www.instagram.com");
	String tittle = obj.getTitle();
	System.out.println();
	obj.manage().window().maximize();
	
	obj.navigate().back();
	String current = obj.getCurrentUrl();
	System.out.println(current);
	obj.navigate().forward();
	
	obj.navigate().refresh();
	
	obj.close();
	}

}
