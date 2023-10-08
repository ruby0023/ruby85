package seleniumtest;
import java.time.Duration;

import org.openqa.selenium.By;
		import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
		import io.github.bonigarcia.wdm.WebDriverManager;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebDriver.Options;
		import org.openqa.selenium.WebElement;
		
public class ellmenusviewpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		driver.get("https://merchant.ellmenusdev.com/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ellmenus");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ellmenus");
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='avatarImg']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='View']")).click();
		Thread.sleep(2000);
		
	}

}
