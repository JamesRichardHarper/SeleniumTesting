package Utility;

import java.util.Scanner;

public class CookieScanner {

    public static Scanner Scan = new Scanner(System.in);

    public static int GetInt(){
        int input;
        input = Scan.nextInt();
        Scan.nextLine();

        return input;
    }

    public static String GetString(){
        String input;
        input = Scan.nextLine();
        return input;
    }

}
