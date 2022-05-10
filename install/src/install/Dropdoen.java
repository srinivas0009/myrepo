package install;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdoen {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://letcode.in/dropdowns");


driver.manage().window().maximize();

WebElement fruits=driver.findElement(By.id("fruits"));

Select myfruit = new Select(fruits);


myfruit.selectByVisibleText("Banana");

myfruit.selectByVisibleText("Apple");


List <WebElement> my =myfruit.getOptions();

for(WebElement WebElement : my) {
	
	System.out.println(WebElement.getText());
}

Dimension a = fruits.getSize();

System.out.println(a);
boolean fru = myfruit.isMultiple();
System.out.println("multiple or not:"+fru);

 //fruits.forEach(i-> System.out.println(i.getText()));

WebElement country = driver.findElement(By.id("country"));


Select mycountry = new Select (country);

mycountry.selectByValue("India");

WebElement selectedcountry = mycountry.getFirstSelectedOption();

System.out.println( selectedcountry.getText());


WebElement heros = driver.findElement(By.id("superheros")) ;

Select myhero = new Select(heros);

boolean ismul = myhero.isMultiple();

System.out.println("is multiple:"+ismul);

myhero.selectByIndex(0);

myhero.selectByValue("bt");

myhero.selectByValue("aq");

myhero.deselectByIndex(0);
List<WebElement> allhero = myhero.getAllSelectedOptions();


for (WebElement WebElement : allhero) {
	
	System.out.println(WebElement.getText());
}




















System.out.println();






	}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
