package Ellmenustest2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reservationsettingpage {
	 WebDriver driver;
	 @Test(priority=0) 
	 public void open_url() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://merchant.ellmenusdev.com/login");
			Thread.sleep(2000);
			
}
	 //login functionality
	 @Test(priority=1)
	 public void pagelogin() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("rajbhog19874");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("rajbhog");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary btn-next shepherd-button ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-describedby='dropdownmenu-user-description']//button[contains(@class,'btn btn-sm btn-primary btn-next shepherd-button')][normalize-space()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[8]/div[2]/footer[1]/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary btn-next shepherd-button '])[4]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
		Thread.sleep(2000);
	 }
//table booking and event booking
	 //1.disabled all function 2.set guest quantity  3.booking pre hours
	 @Test(priority=2)
	 public void openreservationpage1() throws InterruptedException {
	
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-user-link p-0']//p[1]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[normalize-space()='Venue Setup']")).click();
			Thread.sleep(2000);
	
			driver.findElement(By.xpath("//html/body/div[2]/div[2]/header/button/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app-content-inner-main\"]/div[2]/div[2]/div[1]/ul/li[3]/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='table_booking_reservation_status_danger']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//label[@for='table_booking_pre_reservation_in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='table_booking_pre_hours']")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='table_booking_pre_minutes']")).sendKeys("23");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='tab-content py-50']//div[@class='tab-pane active']//button[@type='submit'][normalize-space()='Submit']")).click();
			Thread.sleep(8000);
	 		driver.findElement(By.xpath("//li[@data-target='#event_booking']//a[@class='nav-link'][normalize-space()='Event Booking']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='tab-content py-50']//div[@class='tab-pane active']//button[@type='reset'][normalize-space()='Reset']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='event_booking_maximum_no_of_guests']")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='id_event_booking_auto_approve']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='tab-content py-50']//div[@class='tab-pane active']//button[@type='submit'][normalize-space()='Submit']")).click();
			Thread.sleep(9000);
	 }
	 //open view page check reservation

	 @Test(priority=3)
	 public void openreservationviewpage1() throws InterruptedException {	 
		driver.get("https://ellmenusdev.com/menu-rajbhog-kitchen-eastern-province");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/main/div[1]/div/div[1]/p")).click();
		    Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[normalize-space()='Tap to Start']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//label[normalize-space()='Night']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='icon-bx reservationAction blob']")).click();
	 }
	
	}

	 
