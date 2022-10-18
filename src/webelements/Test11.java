package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInLabel"));
		if(checkbox.isSelected())
		{
			System.out.println("Pass : Element is selected");
			checkbox.click();
		}
		else
		{
			System.out.println("Fail : Element is not selected");
			
		}
		
		driver.close();

	}

}
