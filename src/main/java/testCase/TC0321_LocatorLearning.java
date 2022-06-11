package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
		/*driver.findElement(By.className("ubermenu-target-text")).click();
		Thread.sleep(2000);
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		// Scroll to Top
		/*js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		*/// Scroll to specific Element
		WebElement e = driver.findElement(By.className("elementor-size-default"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(5000);
		driver.findElement(By.className("size-woocommerce_thumbnail")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("xt_woofcicon-flat-plus")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("xt_woofc-footer-label")).click();
		Thread.sleep(2000);
	
	}
}
