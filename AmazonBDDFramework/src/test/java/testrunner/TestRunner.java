package testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\alvin\\OneDrive\\Documents\\Projects\\Amazon\\AmazonBDDFramework\\src\\test\\java\\feature", glue= {"stepdef"}, tags = "@signed_in")
public class TestRunner {
	
	@BeforeClass
	public static void setup() {
		DriverUtil.initialize();
		
	}
}

