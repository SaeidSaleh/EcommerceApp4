package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "StepDefinitions",
        tags = "@regression",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/smoke.xml",
                "rerun:target/rerun.txt"},
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {
}