package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Manjunatha\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
}
