package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

  private static Properties prop;

  private static WebDriver driver;

  public static void initialize() {

    if (driver == null) {
      try {
        prop = new Properties();
        FileInputStream file = new FileInputStream(
            "C:\\Users\\alvin\\eclipse-workspace\\AmazonTDDFramework\\src\\test\\java\\environmentvariables\\Config.properties");
        prop.load(file);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException a) {
        a.printStackTrace();
      }
    }
  }

  public static WebDriver getDriver() {
    initialize();
    return driver;
  }

  public static Properties getProperties() {
    return prop;
  }
}
