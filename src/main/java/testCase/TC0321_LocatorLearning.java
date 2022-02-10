package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC0321_LocatorLearning extends DriverSetup{
	String baseUrl="https://www.islamicshopdk.com/";
	
	@Test
	public void  locatorLearning() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.className("ubermenu-target-text")).click();
		Thread.sleep(2000);
		
	
	}
}
