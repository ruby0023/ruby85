package seleniumtest1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Menumanagement {
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
			
			 driver.findElement(By.xpath("//span[normalize-space()='Menu Management']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//span[normalize-space()='Categories']")).click(); 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[normalize-space()='Add']")).click(); 
			 
		 }
		
		 @Test(priority=3)
		 
			 public void categoriesadd() throws InterruptedException {
			 driver.findElement(By.xpath("//input[@id='label_name2']")).sendKeys("الطبق الرئيسي");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//textarea[@id='label_name5']")).sendKeys("الطبق الرئيسي"); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='label_name3']")).sendKeys("Family pack large");
			 driver.findElement(By.xpath("//textarea[@id='label_name6']")).sendKeys("cola, fries,burger,garlic bread");
			 driver.findElement(By.xpath("//select[@id='parent_cat_id']")).sendKeys("soup");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click(); 
			 Thread.sleep(5000);
			//driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click(); 
			
		 }
		 @Test(priority=4)
		 
		 public void productadd() throws InterruptedException {	 
			 
			 driver.findElement(By.xpath("//span[normalize-space()='Products']")).click(); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[normalize-space()='Add']")).click(); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[normalize-space()='Item Details']")).click(); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='label_name2']")).sendKeys("ايس كريم فراولة");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='label_name3']")).sendKeys("strawberry ");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//textarea[@id='label_name5']")).sendKeys("ايس كريم فراولة");
			 driver.findElement(By.xpath("//textarea[@id='label_name6']")).sendKeys("strawberry,milk,cherry");
			 
			
			 driver.findElement(By.xpath("//div[@id='account-details']//span[@class='align-middle d-sm-inline-block d-none'][normalize-space()='Next']")).click(); 
			 Thread.sleep(2000);
		 }
			 @Test(priority=5)
			 public void productadd1() throws InterruptedException {	
			 driver.findElement(By.xpath("//label[normalize-space()='Drinks']")).click(); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//label[normalize-space()='Addition1']")).click();  
			 driver.findElement(By.xpath("//div[@id='personal-info']//span[@class='align-middle d-sm-inline-block d-none'][normalize-space()='Next']")).click(); 
			 driver.findElement(By.xpath("//label[@for='addonListItems276']")).click();  
			 driver.findElement(By.xpath("//label[normalize-space()='french salad']")).click();  
			 driver.findElement(By.xpath("//div[@id='step-address']//span[@class='align-middle d-sm-inline-block d-none'][normalize-space()='Next']")).click();
			 driver.findElement(By.xpath("//label[normalize-space()='spicy']")).click();
			 driver.findElement(By.xpath("//label[normalize-space()='seeds and oil']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[normalize-space()='Prices & Portions']")).click(); 
			 Thread.sleep(2000);
		 }
			 @Test(priority=6)
			 public void productadd2() throws InterruptedException {
			 driver.findElement(By.xpath("//select[contains(@id,'foodItemSizesList')]")).click(); 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//select[contains(@id,'foodItemSizesList')]")).sendKeys(Keys.DOWN,Keys.ENTER);
			driver.findElement(By.xpath("//select[contains(@id,'foodItemSizesList')]")).click(); 
			driver.findElement(By.xpath("//input[contains(@id,'foodItemPriceList')]")).sendKeys("50");
			driver.findElement(By.xpath("//input[contains(@id,'foodItemCarbsList')]")).sendKeys("30");
			driver.findElement(By.xpath("//input[contains(@id,'foodItemCaloriesList')]")).sendKeys("100");
			driver.findElement(By.xpath("//input[contains(@id,'foodItemFatList')]")).sendKeys("10");
			driver.findElement(By.xpath("//input[contains(@id,'foodItemProteinsList')]")).sendKeys("50");
			driver.findElement(By.xpath("//input[contains(@id,'foodItemVitaminsList')]")).sendKeys("A,C");
			driver.findElement(By.xpath("//button[normalize-space()='Add New Row']")).click();
			
			
			
}
}