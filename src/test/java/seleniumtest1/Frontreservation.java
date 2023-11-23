package seleniumtest1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Frontreservation {
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
	 public void openview_page() throws InterruptedException {
		 driver.get("https://ellmenusdev.com/menu-friespy");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Tap to Start']")).click();
		 Thread.sleep(5000);
	  
		 driver.findElement(By.xpath("//div[@class='icon-bx reservationAction blob']")).click(); 
	  
		 Thread.sleep(1000);
	  
		driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='first_name']")).sendKeys("chota bheem");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='last_name']")).sendKeys("chota12");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='mobile']")).sendKeys("87557-23151"); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='email']")).sendKeys("ruby.00.sharma@gmail.com");
		 
		 
		 
		 driver.findElement(By.xpath("//button[@data-formid='frm-book']//i[@class='fa fa-long-arrow-right']")).click();
		 
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='date_booking']")).sendKeys("11/20/2023"); 
		 
		 driver.findElement(By.xpath("//form[@id='frm-book']//select[@id='booking_time']")).sendKeys("11:45AM");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='number_guest']")).sendKeys("4");
		 driver.findElement(By.xpath("//label[@for='table-position-indoor']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//label[@for='partition-table']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@id='frm-book']//input[@id='i-agree-checkbox-input']")).click(); 
		 Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@id='submit-icon']")).click(); 

		
		 
		 
}
	  @Test(priority=2)
		 public void waitinglist() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[@id='pills-watinglist-tab']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='form-all-action w-full']//input[@id='first_name']")).sendKeys("sujal");
			 driver.findElement(By.xpath("//div[@class='form-all-action w-full']//input[@id='last_name']")).sendKeys("sujal");
			 driver.findElement(By.xpath("//div[@class='form-all-action w-full']//input[@id='mobile']")).sendKeys("87557-23151");
			
			 driver.findElement(By.xpath("//div[@class='form-all-action w-full']//input[@id='email']")).sendKeys("ruby.00.sharma@gmail.com");
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"frm-book-waiting-list\"]/div[3]/button[2]")).click();
	  
	  }
	  @Test(priority=3)
		 public void eventlist() throws InterruptedException {
			 
			 driver.findElement(By.xpath("//a[@id='pills-event-booking-tab']")).click();
			 Thread.sleep(3000);
			
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='first_name']")).sendKeys("dholu");
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='last_name']")).sendKeys("Dhplak");
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='mobile']")).sendKeys("87557-23151"); 
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='email']")).sendKeys("ruby.00.sharma@gmail.com");
			 driver.findElement(By.xpath("//button[@data-formid='frm-book-event']//i[@class='fa fa-long-arrow-right']")).click();
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='date_booking']")).sendKeys("11/20/2023");
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//select[@id='booking_time']")).sendKeys("11:45AM");
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='number_guest']")).sendKeys("4");
			 driver.findElement(By.xpath("//label[normalize-space()='Half Day']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//form[@id='frm-book-event']//input[@id='i-agree-checkbox-input']")).click();
			 Thread.sleep(1000);
			// driver.findElement(By.xpath("//*[@id=\"submit-icon\"]")).click(); 
			 //Thread.sleep(1000);
			 
}
}
