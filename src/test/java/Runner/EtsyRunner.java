package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\Jama\\IdeaProjects\\CucumberFrameworkTechtorial\\src\\test\\" +
                "resources\\com.cucumber.features.etsy",
        glue = "StepDefinitions\\Etsy",
        monochrome = true

)

public class EtsyRunner {
}
