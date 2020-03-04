package Pages.WebOrders;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.List;

public class ViewAllProductsPage {

    public ViewAllProductsPage (){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//table[@class='ProductsTable']//tr")
    public List<WebElement>listOfProducts;

    @FindBy(xpath = "//h2")
    public WebElement listOfOrders;

    public List<String> actualProductList(){
        List<String> productData = new ArrayList<>();
        for(WebElement element: listOfProducts){
            productData.add(element.getText());
        }return productData;
    }
    public List<String> expectedProductsList(){
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Product name Price Discount");
        expectedList.add("MyMoney $100 8%");
        expectedList.add("FamilyAlbum $80 15%");
        expectedList.add("ScreenSaver $20 10%");
        return expectedList;
    }
}
