package seleniumtest;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNG {
	WebDriver driver;
 @BeforeMethod
public void open_url() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	 
	 driver = new ChromeDriver();
	driver.get("https://merchant.ellmenusdev.com/login");
	driver.manage().window().maximize();
}
@Test 
public void login() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ellmenus");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("ellmenus");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}


}




