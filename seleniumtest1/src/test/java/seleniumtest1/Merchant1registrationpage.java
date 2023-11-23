package seleniumtest1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Merchant1registrationpage {
	
		WebDriver driver;
		 @Test(priority=0)
		public void open_url() throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Options object_name= driver.manage();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.get("https://merchant.ellmenusdev.com/register");
			
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='company_name_en']")).sendKeys("khusbu");
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//input[@id='company_name_ar']")).sendKeys("تخصيصو");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id='cr_number']")).sendKeys("444667");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='tax_invoice_no']")).click();
				Thread.sleep(2000);
}
		 @Test(priority=1) 
		 public void useraccount_1() throws InterruptedException {	
			 
			 driver.findElement(By.xpath("//div[@class='d-flex justify-content-end']//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//select[@id='venue-type-wizard-horizontal']")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//select[@id='venue-type-wizard-horizontal'])[1]")).click();
				Thread.sleep(3000);
			
				driver.findElement(By.xpath("//input[@id='restaurant_name_en']")).sendKeys("khusbu shop");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='restaurant_name_ar']")).sendKeys("تخصيصو");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@title='Saudi Arabia: + 966']")).click();
				
				driver.findElement(By.xpath("//div[@class='flag in']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("000000000");
				
				driver.findElement(By.xpath("//input[@id='restaurant_email']")).sendKeys("ruby.00.sharma12@gmail.com");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//select[@id='venue-country-wizard-horizontal']")).sendKeys("India");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//select[@id='venue-region-wizard-horizontal']")).sendKeys("Punjab");
				
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("//div[@class='select__value-container select__value-container--is-multi css-1hwfws3']")).click();
				Thread.sleep(2000);
				
		 }
		 @Test(priority=2) 
		 public void useraccount_2() throws InterruptedException {	

				driver.findElement(By.xpath("(//span[@class='align-middle d-sm-inline-block d-none'][normalize-space()='Next'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='contact_first_name']")).sendKeys("khusbu");
				
				driver.findElement(By.xpath("//input[@id='contact_last_name']")).sendKeys("sharma");
				
				driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("ruby.00.sharma12@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@title='Saudi Arabia: + 966']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@placeholder='5xxxxxxxx']")).sendKeys("87557-23151");
					
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("khusbu");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("khusbu123");
				
				driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("khusbu123");
				driver.findElement(By.xpath("//div[@id='step-address']//button[@type='submit']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='step-owner']//button[@type='submit']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[@for='terms_conditions']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Yes, all is correct']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		 }
		 }

		 
