package StepDefinitions.Etsy;

import Pages.Etsy.EtsySearchesPage;
import Utils.BrowserUtils;
import Utils.ConfigurationReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EtsySearchesStepDefs {

    WebDriver driver = Driver.getDriver();
    EtsySearchesPage page = new EtsySearchesPage();

    @Given("the user navigate to the Etsy")
    public void the_user_navigate_to_the_Etsy() {
        driver.get(ConfigurationReader.getProperty("etsyUrl"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("the user search with {string}")
    public void the_user_search_with(String searchValue) {
        page.searchTab.sendKeys(searchValue);
        BrowserUtils.waitForSec(3);
        page.searchButton.click();
    }

    @Then("the user validate the {string}")
    public void the_user_validate_the(String expectedValue) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedValue);
    }



}