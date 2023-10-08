package seleniumtest;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ellmenustesting4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		File photo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		driver.quit();
		try
		{
			FileUtils.copyFile(photo, new File("C:\\Users\\hp\\desktop\\facebook.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
