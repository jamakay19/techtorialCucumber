package Pages.Etsy;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchesPage {

    public EtsySearchesPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="global-enhancements-search-query")
    public WebElement searchTab;
    @FindBy(xpath = "//div[@id='global-enhancements-search-suggestions']//preceding::button[@type='submit']")
    public WebElement searchButton;
}
