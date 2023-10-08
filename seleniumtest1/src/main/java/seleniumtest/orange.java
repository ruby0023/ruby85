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
public class orange {
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
			driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("\r\n"
					+ "Cheeku");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).click();
			Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//span//following::div[28]/div/div")).sendKeys(Keys.DOWN,Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("\r\n"
			+ "Virat Kohli");
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).sendKeys(Keys.DOWN,Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	

	

	}

}
