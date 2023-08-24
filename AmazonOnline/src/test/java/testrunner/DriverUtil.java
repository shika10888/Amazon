package testrunner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {

	
	 private static WebDriver driver;
	
	 public static void initialize() { 
		 
		 if (driver == null) { 
			 driver = new ChromeDriver(); 
			 System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
			 driver.manage().window().maximize();
			 driver.get("https://www.amazon.ca/");
				Actions actions= new Actions(driver);
				   actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
				   driver.findElement(By.className("nav-action-inner")).click();
				   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ap_email\"]"))).isDisplayed();
				   driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shika10888+1@gmail.com");
				   driver.findElement(By.id("continue")).click();
				   driver.findElement(By.id("ap_password")).sendKeys("abcdef");
				   driver.findElement(By.id("signInSubmit")).click();
		 } 
	}
	
	 public static WebDriver getDriver() { 
		 initialize();
		 return driver; 
	 }
	 
	
}
