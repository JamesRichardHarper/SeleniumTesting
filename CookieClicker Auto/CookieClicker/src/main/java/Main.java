import Methods.AutoMethods;
import Methods.UserMethods;
import Utility.CookieScanner;
import Utility.CookieSettings;

public class Main {

    public static void main(String[] args){

        CookieSettings.Setup();
        CookieSettings.GoToCookie();

        UserMethods.JuanClique();
        System.out.println(AutoMethods.GetAmount());


    }

}
