package testLayer;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import basePackage.BaseSignin;
import pom.PomAmazonHeader;
import pom.PomShoppingCart;
import utility.DriverUtil;
import utility.TimeUtils;

public class ShoppingCartTest extends BaseSignin {
  PomShoppingCart cart;
  PomAmazonHeader Searchs;
  WebDriver driver;

  Properties prop;

  public ShoppingCartTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    Searchs = new PomAmazonHeader();
    cart = new PomShoppingCart();
  }

  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_add_items_to_cart() {
    TimeUtils.explicitWait(By.id("twotabsearchtextbox"));

    Searchs.typeSearchKeyword(prop.getProperty("SearchKeyword"));
    Searchs.clickSearchbutton();
    cart.clickHandbag();
    cart.displayBagdetails();
    cart.displayQuantity();
    cart.clickAddtoCart();
    cart.displayCartSubtotal();
  }

}
