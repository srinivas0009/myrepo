package install;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1accountcreation {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();


driver.get("http://automationpractice.com/index.php");

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.findElement(By.xpath(" (//a[@rel='nofollow'] )[1]")).click();

driver.findElement(By.name("email_create")).sendKeys("srinivastheengineer@gmail.com");

driver.findElement(By.id("SubmitCreate")).click();

driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

driver.findElement(By.name("customer_firstname")).sendKeys("srini");

driver.findElement(By.id("customer_lastname")).sendKeys("vas");

driver.findElement(By.id("passwd")).sendKeys("nallapassword@12");

WebElement day = driver.findElement(By.id("days"));

Select  myday = new Select(day);

myday.selectByValue("20");

WebElement mymonth = driver.findElement(By.name("months"));

Select month = new Select (mymonth);

month.selectByIndex(9);

WebElement year = driver.findElement(By.name("years"));

Select myyear = new Select (year);

myyear.selectByIndex(27);

WebElement element = driver.findElement(By.name("newsletter"));

element.click();

driver.findElement(By.name("optin")).click();

driver.findElement(By.name("company")).sendKeys("tcs");

driver.findElement(By.name("address1")).sendKeys("nehru street,pobox4117,virudhachalam");
driver.findElement(By.name("address2")).sendKeys("address");

driver.findElement(By.name("city")).sendKeys("chennai");
WebElement ele = driver.findElement(By.name("id_state"));

Select state = new Select (ele);

state.selectByIndex(1);

driver.findElement(By.name("postcode")).sendKeys("60320");

WebElement country = driver.findElement(By.name("id_country"));

Select mycountry = new Select (country);
mycountry.selectByIndex(1);

driver.findElement(By.id("phone_mobile")).sendKeys("8072212408");

driver.findElement(By.id("alias")).sendKeys("address1");

driver.findElement(By.name("submitAccount")).click();
	}
}
