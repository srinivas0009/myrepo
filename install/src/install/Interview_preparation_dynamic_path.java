package install;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview_preparation_dynamic_path {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\drivernew\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://blog.testproject.io/2021/08/31/xpaths-best-practices");
    
    driver.manage().window().maximize();
    
    
    
    
	}

}
