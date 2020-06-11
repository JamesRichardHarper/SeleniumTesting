import Page.Landing;
import Utility.CookieSettings;

public class Methods {

    static Landing MainPage = CookieSettings.SetupPageclass();

    public static void SmashCookie(int Times){
        for(int start = 0 ; start < Times ; start++){
            MainPage.Cookie.click();
        }
    }

}
