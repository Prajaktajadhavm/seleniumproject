package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		
		//driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.name("email")).sendKeys("abcdfd");
		driver.findElement(By.id("id_password")).sendKeys("abc");
		driver.findElement(By.xpath("submit-id-submit")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Login | Udemy"))
		{
		
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
