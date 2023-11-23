package seleniumtest1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Promotions {
	private static final String ArrowDown = null;
	WebDriver driver;
	 @Test(priority=0)
	 public void open_url() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		 driver.manage().window().maximize();
}
	 @Test(priority=1)
	 public void loginpage() throws InterruptedException {
		 driver.get("https://merchant.ellmenusdev.com/login");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("Friespy");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ruby123");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary btn-next shepherd-button ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-describedby='dropdownmenu-user-description']//button[contains(@class,'btn btn-sm btn-primary btn-next shepherd-button')][normalize-space()='Next']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[8]/div[2]/footer[1]/button[3]")).click();
			
			driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary btn-next shepherd-button '])[4]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
}


@Test(priority=2)
public void menumanagement_menu() throws InterruptedException {

	driver.findElement(By.xpath("//span[normalize-space()='Renew Package']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='package_id']")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='ellMenus Store']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[4]/div[5]/div[3]/button[1]/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Move to cart']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='View in cart']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
}
}