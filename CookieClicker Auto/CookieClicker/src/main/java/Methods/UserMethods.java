package Methods;

import Page.Landing;
import Utility.CookieSettings;

public class UserMethods {

    static Landing MainPage = CookieSettings.SetupPageclass();

    public static void SmashCookie(int Times){
        for(int start = 0 ; start < Times ; start++){
            MainPage.Cookie.click();
        }
    }

    public static void JuanClique(){
        MainPage.Cookie.click();
    }

}
