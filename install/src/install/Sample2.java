package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	

	private static WebElement findElement;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver bjp = new ChromeDriver();

bjp.get("https://www.instagram.com/");
Thread.sleep(5000);


WebElement find= bjp.findElement(By.xpath("//input[@type='text']"));
find.sendKeys("thirumal");

//WebElement mail =  bjp.findElement(By.xpath("//h1[text()='Instagram']"));

System.out.println("//h1[text()='Instagram']");
//mail.sendKeys("santhosh");



//WebElement pass = bjp.findElement(By.xpath("//input[@type='password']"));
//pass.sendKeys("9876543311");





	}

}
