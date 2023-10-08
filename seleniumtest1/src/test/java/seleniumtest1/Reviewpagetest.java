package seleniumtest1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reviewpagetest {
	WebDriver driver;
	 @Test(priority=0)
	 public void open_url() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		 driver.manage().window().maximize();
	 }
	
	
	  @Test(priority=1)
	 
	 public void openview_page() throws InterruptedException {
		 driver.get("https://ellmenusdev.com/menu-friespy");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[normalize-space()='Tap to Start']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//label[normalize-space()='Night']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"tabs-links-full\"]/li[8]/a")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("nitesh");
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"merchantRatingForm\"]/div[2]/div/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"merchantRatingForm\"]/div[2]/div/div/div/ul/li[3]/span[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//form[@method='POST']//div//div//div//input[contains(@placeholder,'i.e. 505xxxxx')]")).sendKeys("87557-23151");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("GOOD");
		 
		driver.findElement(By.xpath("//label[@for='star-14']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='star-24']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='star-33']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='star-44']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='star-55']")).click();
		 Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click(); 
		 driver.findElement(By.xpath("//button[@id='submitMerchantRating']")).click(); 
		  driver.findElement(By.xpath("//a[@class='full-version-footer-close']//i[@class='fa fa-chevron-circle-up']")).click(); 
	  }
	  
	 /* @Test(priority=2)
	  public void cart_value() throws InterruptedException {
		  
		  //driver.get("https://ellmenusdev.com/menu-friespy");
		  driver.findElement(By.xpath("//div[contains(@class,'open-product-summary item-bx item-list')]//a[@class='search_item'][normalize-space()='Friespy chicken large']")).click();
		  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();

		Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='ion-ios-cart']")).click(); 
		  Thread.sleep(3000); 
	  }
	  
	  @Test(priority=3)  
	  public void cart_checkout() throws InterruptedException {
		  Thread.sleep(3000); 
		 driver.get("https://ellmenusdev.com/view-cart");
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[normalize-space()='Checkout']")).click();
		  Thread.sleep(5000);
		
	  }
	 @Test(priority=4) 
	 public void cart_payment() throws InterruptedException	{  
	
	 
	driver.get("https://ellmenusdev.com/paymentoption/");
	Thread.sleep(5000);
	 driver.findElement(By.xpath("(//input[@id='first_name'])[2]")).sendKeys("Ruby");
	 Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='col-md-10 col-xs-12']//input[@id='last_name']")).sendKeys("sharma");
	  driver.findElement(By.xpath("//input[@id='mobile_phone']")).sendKeys("87557-23151");
	  Thread.sleep(1000);
	driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();*/
}

	



