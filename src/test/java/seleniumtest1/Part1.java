package seleniumtest1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Part1 {
	WebDriver driver;
	 @Test(priority=0)
	 public void open_url() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
	 }
	 @Test (priority=1)
	 public void openpage() throws InterruptedException {
		driver.get("https://merchant.ellmenusdev.com/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ellmenus");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ellmenus");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

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
	public void registration() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Reservation']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Table Booking']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='waves-effect btn btn-primary ml-sm-2 mb-1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vedika");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Sharma");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//div[@title='Saudi Arabia: + 966']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='app-content-inner-main']//li[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("000000000");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ruby.00.sharma@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@aria-label='October 4, 2023']")).click();
	
	driver.findElement(By.xpath("//input[@id='custom-time-input']")).sendKeys("09:38PM");
	
	driver.findElement(By.xpath("//input[@id='guests']")).sendKeys("5");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[normalize-space()='Indoor']")).click();
	
	driver.findElement(By.xpath("//label[normalize-space()='Party']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='waves-effect mr-1 btn btn-primary']")).click();
	Thread.sleep(2000);
	
}
}
