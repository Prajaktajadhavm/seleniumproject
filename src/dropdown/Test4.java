package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prajakta/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("MTR"));
		Select s = new Select(dd);
		s.selectByIndex(1);
		s.selectByValue(" D");
		s.selectByVisibleText("Dosa");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(3000);
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("It is not multiple select dropdown");
		}
	}

}
