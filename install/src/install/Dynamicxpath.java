package install;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
	public static void main(String[] args) {
//converting int into String
int a = 123;
String valueof= String.valueOf(a);
System.out.println(valueof);

//converting string into int

String s ="34343";
int parseInt = Integer.parseInt(s);
System.out.println(parseInt);

//dynamic xpath

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/mens-clothing");
      WebElement findElement = driver.findElement(By.xpath("(//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice'])[1]"));
        List<Integer>product = new ArrayList<>();
      for (WebElement web : product) {
	String replace = web.getText().replace("Rs. ", "");
	
	int parseInt1= Integer.parseInt(replace);
	product.add(parseInt1);
	}
	}

}
