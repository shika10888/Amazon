package testLayer;

import static org.testng.Assert.assertTrue;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import basePackage.BaseSignin;
import pom.PomYourOrders;
import utility.DriverUtil;

public class YourOrdersTest extends BaseSignin{

  PomYourOrders orders;

  WebDriver driver;

  Properties prop;

  public YourOrdersTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    orders = new PomYourOrders();
  }
  
  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_see_orderHistory() throws InterruptedException {
    Thread.sleep(500);
    orders.clickYourOrders();
    orders.clickDropdown();
    orders.BuyAgain();
    assertTrue(driver.findElement(By.tagName("body")).getText().contains("There are no recommended items for you to buy again at this time. Check Your Orders for items you previously purchased."));
    orders.CancelledOrders();
    assertTrue(driver.findElement(By.tagName("body")).getText().contains("We aren't finding any cancelled orders (for orders placed in the last 6 months)"));
    orders.NotyetShipped();
    assertTrue(driver.findElement(By.tagName("body")).getText().contains("Looking for an order? All of your orders have shipped"));
  }  
}
