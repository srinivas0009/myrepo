package install;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://letcode.in/table");

WebElement table= driver.findElement(By.id("simpletable"));

List<WebElement> headers= table.findElements(By.tagName("th"));

for (WebElement web : headers) {
	String text = web.getText();
	System.out.println(text);
}

List<WebElement> bodyrow= table.findElements(By.xpath("//table/tbody/tr/td"));

for (WebElement row1 : bodyrow) {
	String text1 = row1.getText();
	System.out.print(text1);
}
List<WebElement> firstcolumn= table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr[1]/td[3]"));

for (WebElement column1 : firstcolumn) {
System.out.println(column1.getText());
	
}
	}

}
