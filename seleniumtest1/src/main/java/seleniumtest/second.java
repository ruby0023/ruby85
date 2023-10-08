package seleniumtest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
public class second {

	
		// TODO Auto-generated method stub
		private static Thread time;
		private static Object keys;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				Options object_name= driver.manage();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Admin']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper']//following::div[4]")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Ruby");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).sendKeys(Keys.DOWN,Keys.ENTER);
	}

}
