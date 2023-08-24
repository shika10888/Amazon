package testLayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import basePackage.BaseSignin;
import utility.DriverUtil;

public class SigninTest extends BaseSignin {
  WebDriver driver;

  public SigninTest() {
    super();
    driver = DriverUtil.getDriver();
  }

  @Test
  public void Signin() {
    LoginMessage.isDisplayed();
  }
}
