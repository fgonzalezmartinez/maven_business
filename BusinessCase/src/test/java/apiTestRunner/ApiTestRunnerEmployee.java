package apiTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"apiStepsDefinitions"},
        tags = {"not @tag"}

)

public class ApiTestRunnerEmployee extends AbstractTestNGCucumberTests {

}
