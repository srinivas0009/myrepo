package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://demo.automationtesting.in/Frames.html");

driver.manage().window().maximize();

int size = driver.findElements(By.tagName("iframe")).size();
System.out.println(size);

driver.switchTo().frame(0);

 WebElement ts  = driver.findElement(By.xpath("//input[@type='text']"));
ts.sendKeys("tata");

driver.switchTo().defaultContent();

WebElement web = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
web.click();

//driver.switchTo().frame(1);
//driver.switchTo().frame(0);

WebElement out = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
driver.switchTo().frame(out);

WebElement inn = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
driver.switchTo().frame(inn);

WebElement web1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
web1.sendKeys("dmk");









	}

}
