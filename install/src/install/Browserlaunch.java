package install;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	

	public static void main(String[] santh) throws AWTException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\install\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver ();

driver.get("https:/amazon.in");

driver.manage().window().maximize();


Robot rob = new Robot();
Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle  rec = new Rectangle(screensize);
BufferedImage src = rob.createScreenCapture(rec);
File dest = new File ("C:\\Users\\DELL\\eclipse-workspace\\install\\Screenshot\\amazon.png");
ImageIO.write(src, "png", dest);


	}
	

}
