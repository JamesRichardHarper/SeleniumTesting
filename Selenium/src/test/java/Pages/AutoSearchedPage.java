package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoSearchedPage {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul")
    public WebElement productList;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")
    public WebElement addItemToCart;
    //*[@id="center_column"]/ul/li[1]/div/div[2]/div[2]/a[2]
    //*[@id="center_column"]/ul/li[1]/div/div[1]/div/a[1]

//    public Boolean isOneDress(WebElement productList){
//
//    }

}
