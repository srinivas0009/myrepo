package install;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public DragandDrop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://jqueryui.com/droppable/");

driver.switchTo().frame(0);

WebElement source= driver.findElement(By.id("draggable"));

WebElement target = driver.findElement(By.id("droppable"));

Actions act = new Actions(driver);

act.dragAndDrop(source, target).perform();
	}

}
