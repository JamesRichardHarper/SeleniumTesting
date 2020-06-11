import Utility.CookieScanner;
import Utility.CookieSettings;

public class Main {

    public static void main(String[] args){

        CookieSettings.Setup();
        CookieSettings.GoToCookie();

        Methods.SmashCookie(CookieScanner.GetInt());


    }

}
