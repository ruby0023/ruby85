package seleniumtest1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Eventbooking {
	WebDriver driver;
	 @Test(priority=0)
	public void open_url() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		 driver.manage().window().maximize();
		 driver.get("https://merchant.ellmenusdev.com/login");
	 }
	 @Test(priority=1)
	 public void openreservationpage() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ellmenus");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ellmenus");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary btn-next shepherd-button ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-describedby='dropdownmenu-user-description']//button[contains(@class,'btn btn-sm btn-primary btn-next shepherd-button')][normalize-space()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[8]/div[2]/footer[1]/button[3]")).click();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary btn-next shepherd-button '])[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
		Thread.sleep(2000);
	 }
	 @Test(priority=2)
	 public void openreservationpage1() throws InterruptedException {
		 driver.findElement(By.xpath("//span[text()='Reservation']")).click();
			Thread.sleep(2000);
}
}
