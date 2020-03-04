package StepDefinitions.WebOrders;

import Pages.WebOrders.HomePage;
import Pages.WebOrders.ViewAllProductsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewAllProductsStepDefs {
    HomePage page = new HomePage();
    ViewAllProductsPage allProductsPage = new ViewAllProductsPage();

    @Then("the user click view all products button")
    public void the_user_click_view_all_products_button() {
        page.viewAllProductsButton.click();
    }

    @Then("the user validate product table")
    public void the_user_validate_product_table() {
       List<String> actualList = allProductsPage.actualProductList();
       List<String>expectedList = allProductsPage.expectedProductsList();

        Assert.assertTrue(actualList.containsAll(expectedList));
    }











}
