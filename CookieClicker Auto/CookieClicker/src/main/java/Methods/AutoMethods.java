package Methods;

import Page.Landing;
import Utility.CookieSettings;

public class AutoMethods {

    static Landing MainPage = CookieSettings.SetupPageclass();

//    public static void GoHamUntil(int Times){
//        while(Integer.parseInt(Start) < Times){
//            MainPage.Cookie.click();
//        }
//    }

    public static String GetAmount(){
        String Start = MainPage.CookieAmount.getAttribute("innerText");
        return Start;
    }

}
