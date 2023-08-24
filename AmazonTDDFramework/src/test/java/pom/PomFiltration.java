package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import basePackage.BaseAmazonClass;
import utility.DriverUtil;

public class PomFiltration extends BaseAmazonClass {

  WebDriver driver;

  @FindBy(css = "#p_72\\/11192170011 > span > a > section > i")
  WebElement CustomerReview;
  @FindBy(css = "#p_36\\/12035762011 > span > a > span")
  WebElement Price;
  @FindBy(css = "#p_89\\/lululemon > span > a > div > label")
  WebElement Brand;
  @FindBy(id = "a-autoid-0-announce")
  WebElement Sort;


  public PomFiltration() {
    driver = DriverUtil.getDriver();
    PageFactory.initElements(driver, this);
  }

  public void clickCustomerReview() {
    CustomerReview.click();
  }

  public void clickBrand() {
    Brand.click();
  }

  public void clickPrice() {
    Price.click();
  }

  public void clickSort() {
    Sort.click();
    Select select = new Select(driver.findElement(By.id("a-autoid-0-announce")));
    select.selectByVisibleText("Newest Arrivals");
  }



}
