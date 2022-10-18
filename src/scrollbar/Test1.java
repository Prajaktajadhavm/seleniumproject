package scrollbar;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		/*//case1
		System.out.println("x+y"); --> x+y
		//case2
		System.out.println(x+y);  -->values*/
		
		
		//typecasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x +","+ y +")");
		
		Thread.sleep(3000);
		ele.click();
		
	//	js.executeScript("arguments[0].click()",ele);
		
		
		
	}

}
