package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("abc");
		driver.findElement(By.name("username")).sendKeys("abc345");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]")).click();
		
//		driver.close();
		
		
	}
}
