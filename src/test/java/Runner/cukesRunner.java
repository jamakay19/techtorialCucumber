package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\Jama\\IdeaProjects\\CucumberFrameworkTechtorial\\src\\test\\resources\\com.cucumber.features\\WebOrderLogin.feature",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = true

)

public class cukesRunner {


}
