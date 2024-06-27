package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "Features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
