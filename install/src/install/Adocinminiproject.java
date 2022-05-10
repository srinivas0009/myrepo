package install;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adocinminiproject {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']")).click();
		
		driver.findElement(By.id("username")).sendKeys("srinivas0009");
		
		driver.findElement(By.id("password")).sendKeys("HBQ7C0");
		
		driver.findElement(By.id("login")).click();

		WebElement find = driver.findElement(By.name("location"));
		Select se = new Select (find);
		se.selectByIndex(1);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		
		Select sel = new Select(hotel);
		
		sel.selectByValue("Hotel Creek");
		
		WebElement room= driver.findElement(By.id("room_type"));
		
		Select sele = new Select (room);
		
		sele.selectByVisibleText("Standard");
		
		WebElement roomsize= driver.findElement(By.id("room_nos"));
		
		Select select = new Select(roomsize);
		
		select.selectByValue("2");
		
		
		
		WebElement element = driver.findElement(By.name("adult_room"));
		
		Select adult= new Select(element);
		adult.selectByIndex(3);
		
		
		WebElement fi = driver.findElement(By.name("child_room"));
		
		Select child = new Select(fi);
		
		child.selectByIndex(2);
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.name("radiobutton_0")).click();
		
		driver.findElement(By.name("continue")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("srini");
		
		driver.findElement(By.name("last_name")).sendKeys("vasan");
		
		driver.findElement(By.name("address")).sendKeys("29,nehru street,cennai");
		
		driver.findElement(By.name("cc_num")).sendKeys("9999999999999999");
		
		
		WebElement card= driver.findElement(By.name("cc_type"));
		
		Select childtype = new Select(card);
		childtype.selectByIndex(3);
		
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		
		Select dt = new Select(month);
		
	dt.selectByIndex(2);
	
	WebElement year = driver.findElement(By.name("cc_exp_year"));
	
	Select yr = new Select(year);
	yr.selectByVisibleText("2022");
	
	
	driver.findElement(By.name("cc_cvv")).sendKeys("654");
	
	WebElement book = driver.findElement(By.name("book_now"));
	book.click();
	
	TakesScreenshot ts = (TakesScreenshot) driver;

	File src = ts.getScreenshotAs(OutputType.FILE);

	File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\install\\Screenshot\\adocin.png");

	FileUtils.copyFile(src, dest);

	
		
		
		
		
		
	}

}
