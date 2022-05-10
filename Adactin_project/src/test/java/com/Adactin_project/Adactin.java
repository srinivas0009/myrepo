package com.Adactin_project;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Adactin extends Baseclass {

	public static WebDriver driver = Baseclass.getBrowser("chrome");
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		geturl(Singleton_filereadermanager.getFRM().getCR().geturl());

		Pageobjects pom = new Pageobjects(driver);
		
		clickbutton(pom.getLp().getBuild2());

		inputText(pom.getLp().getUsername(), "srinivas0009");

		inputText(pom.getLp().getPassword(), "X5C7P0");

		clickbutton(pom.getLp().getLoginbutton());

//WebElement build2 = driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']"));
//clickbutton(build2);

//WebElement user = driver.findElement(By.id("username"));
//inputText(user,"srinivas0009");

//WebElement pass = driver.findElement(By.id("password"));
//inputText(pass,"X5C7P0");

//WebElement login = driver.findElement(By.id("login"));
//clickbutton(login);

		WebElement find = driver.findElement(By.name("location"));
		dropdown(find, "Byvalue", "Brisbane");

		WebElement hotel = driver.findElement(By.name("hotels"));
		dropdown(hotel, "Byindex", "3");

		WebElement room = driver.findElement(By.id("room_type"));
		dropdown(room, "visibletext", "Standard");

		WebElement roomsize = driver.findElement(By.id("room_nos"));
		dropdown(roomsize, "Byvalue", "2");

		WebElement datein = driver.findElement(By.name("datepick_in"));
		datein.clear();
		inputText(datein, "22/3/2022");

		WebElement dateout = driver.findElement(By.name("datepick_out"));
		dateout.clear();
		inputText(dateout, "25/3/2022");

		screenshot();
	}

}
