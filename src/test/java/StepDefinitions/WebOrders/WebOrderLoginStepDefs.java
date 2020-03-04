package StepDefinitions.WebOrders;

import Pages.WebOrders.LoginPage;
import Pages.WebOrders.ViewAllProductsPage;
import Utils.ConfigurationReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderLoginStepDefs {

    WebDriver driver = Driver.getDriver();
    LoginPage page = new LoginPage();

    @Given("the user navigate to the Web Orders page")
    public void the_user_navigate_to_the_Web_Orders_page() {
        System.out.println("Navigated to web order page");
        driver.navigate().to(ConfigurationReader.getProperty("URL"));
    }

    @When("the user provide valid username")
    public void the_user_provide_valid_username() {
        System.out.println("The user sent Tester");
        page.username.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        System.out.println("The user sent test");
        page.password.sendKeys(ConfigurationReader.getProperty("password"));
        page.loginButton.click();
    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        System.out.println("The user validate home page");
        String expectedTitle ="Web Orders";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("the user navigate to the web orders page")
    public void the_user_navigate_to_the_web_orders_page() {
        System.out.println("Navigated to web order page");
        driver.navigate().to(ConfigurationReader.getProperty("URL"));
    }
    @When("the user provide username {string}")
    public void the_user_provide_username(String username) {
    page.username.sendKeys(username); }

    @When("the user provide password {string}")
    public void the_user_provide_password(String password) {
    page.password.sendKeys(password);
    page.loginButton.click(); }

    @Then("the user validate text {string}")
    public void the_user_validate_text(String errorMessage) {
    String actual = page.errorMessage.getText();
    Assert.assertEquals(actual, errorMessage); }

    @When("the user provide username {int}")
    public void the_user_provide_username(Integer username) {
        page.username.sendKeys(""+username);
    }

    @When("the user provide password {int}")
    public void the_user_provide_password(Integer password) {
       page.password.sendKeys(""+password);
       page.loginButton.click();
    }
    @When("the user provide username {string} and password {string}")
    public void the_user_provide_username_and_password(String username, String password) {
        page.username.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButton.click();
    }
    @Then("the user validate the text {string}")
    public void the_user_validate_the_text(String expected) {
        ViewAllProductsPage page = new ViewAllProductsPage();
        String actual =page.listOfOrders.getText();
        Assert.assertEquals(actual, expected);

    }




}
