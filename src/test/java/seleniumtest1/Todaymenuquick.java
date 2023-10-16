package seleniumtest1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Todaymenuquick {
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
	 public void opentoday_menu() throws InterruptedException {
		 driver.get("https://ellmenusdev.com/menu-friespy");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='Tap to Start']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='floatingActionBtnTodayMenu']")).click(); 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@id='todayMenuToggle']")).click(); 
	 }
	 @Test(priority=2)
	 public void opentoday_qucikmenu() throws InterruptedException {
		 driver.findElement(By.xpath("//a[@class='urlActionBtn']")).click();
		
		// driver.get("https://ellmenusdev.com/store/flippdf?slug=friespy#page/1");
		 //driver.findElement(By.xpath("//div[@class='inner-page']//span")).click();
		 
		
		 }
	}
