package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/hz/contact-us/foresight/hubgateway");
		
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.linkText("Home")).click();
		
	}

}
