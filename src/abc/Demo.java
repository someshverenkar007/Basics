package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//to set path
		System.setProperty("webdriver.chrome.driver", "/Users/someshverenkar/Downloads/Selenium softwares/chromedriver");
		
		//Typecasting from chromedriver to webdriver to get all the methods from webdriver interface.
		//Syntax = to open the browser
		WebDriver driver = new ChromeDriver();
		
		//To enter the url - syntax
		driver.get("https://www.facebook.com/");
		
		//to enter the email id
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//to enter the password
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		//to click on login button
		driver.findElement(By.name("login")).click();
		
		
		
		
	
		
	}

}
