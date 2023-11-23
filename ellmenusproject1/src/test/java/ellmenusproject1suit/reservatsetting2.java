package ellmenusproject1suit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//venue setup functionality
public class reservatsetting2 {
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
		 //login functionality test-1

		 @Test(priority=1)
		 public void openreservationpage() throws InterruptedException {
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
			Thread.sleep(2000);
	}
		 //venue setup functionality-2
		 //payment order settings
		 //1-Disabled Cash On delivery 2-Change is required? 3-Pay On Delivery Enabled (all disabled)

		@Test(priority=2)
		 public void openpayment() throws InterruptedException {
		
   driver.findElement(By.xpath("//a[@class='nav-link dropdown-user-link p-0']//p[1]")).click();
	Thread.sleep(2000);
				
	driver.findElement(By.xpath("//span[normalize-space()='Venue Setup']")).click();
	Thread.sleep(2000);
		
	
	 driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/button/span")).click();
	 Thread.sleep(2000);
 
	 driver.findElement(By.xpath("//span[normalize-space()='Payment']")).click();
	 driver.findElement(By.xpath("//label[normalize-space()='Disabled Cash On delivery']")).click();
		
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//label[normalize-space()='Change is required?']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//label[normalize-space()='Pay On Delivery Enabled']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='tab-pane active']//div[@class='tab-pane active']//button[@type='submit'][normalize-space()='Save']")).click();
	 Thread.sleep(4000);
		 }
		//Feedback settings
		 @Test(priority=3)
		 public void openreservatio1() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Feedback']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='tab-pane active']//div[@class='mb-0 row form-group']//button[@type='reset'][normalize-space()='Reset']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='label_name3']")).sendKeys("ruby");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='label_name2']")).sendKeys("tester");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='label_name4']")).sendKeys("hi");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[normalize-space()='English']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[contains(text(),'I acknowledge that ellmenus administration will pu')]")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@class='tab-pane active']//div[@class='mb-0 row form-group']//button[@type='reset'][normalize-space()='Reset']")).click();
		 driver.findElement(By.xpath("//div[@class='tab-pane active']//div[@class='mb-0 row form-group']//button[@type='submit'][normalize-space()='Submit']")).click();
		 Thread.sleep(8000);
	}
	

	 @Test(priority=5)
	 public void openviewpage() throws InterruptedException {
		 driver.get("https://ellmenusdev.com/menu-rajbhog-kitchen-eastern-province");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//p[normalize-space()='English'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(" /html/body/div[1]/div/div[3]/main/div[3]/div/a")).click();
		 Thread.sleep(3000);
		
	 }
	}
}
//automation test completed

	


