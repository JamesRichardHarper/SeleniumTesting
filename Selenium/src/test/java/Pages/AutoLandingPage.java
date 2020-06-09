package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoLandingPage {
    @FindBy(id = "search_query_top")
    public WebElement SearchBar;

    public void search(String searchtext){
        SearchBar.sendKeys(searchtext);
        SearchBar.sendKeys(Keys.ENTER);
    }
}
