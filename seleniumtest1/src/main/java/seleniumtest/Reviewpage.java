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
		
public class Reviewpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Options object_name= driver.manage();
		driver.get("https://ellmenusdev.com/paymentoption/");
		Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//div[@class='col-md-10 col-xs-12 has-error']//input[@id='first_name']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='col-md-10 col-xs-12 has-error']//input[@id='first_name']")).sendKeys("sharma");
		  driver.findElement(By.xpath("//input[@id='mobile_phone']")).sendKeys("87557-23151");
		
			 //driver.findElement(By.xpath("//li[@class='country highlight active']//span[@class='country-name'][contains(text(),'India (भारत)')]")).click();
			 //Thread.sleep(1000);
			 //driver.findElement(By.xpath("//form[@method='POST']//div//div//div//input[contains(@placeholder,'i.e. 505xxxxx')]")).sendKeys("000000000");
			 //Thread.sleep(1000);
			 //driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("GOOD");
	}

}
