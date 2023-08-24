package basePackage;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utility.DriverUtil;

public class BaseAmazonClass {

  public Properties prop = new Properties();
  WebDriver driver;

  @FindBy(id = "nav-link-accountList")
  public WebElement Hello;

  public BaseAmazonClass() {
    driver = DriverUtil.getDriver();
  }

  public void mousehover() {
    Actions actions = new Actions(driver);
    actions.moveToElement(Hello).build().perform();
  }
}

