package kyu7;

import java.util.Collections;

public class HidePasswordFromJdbcUrl {

    public static String hidePasswordFromConnection(String urlString) {

        int pos = urlString.indexOf("password=");
        int len = urlString.length();
        boolean isPasswordBefore = urlString.indexOf("user=") > urlString.indexOf("password=");
        String res = "";

        if(isPasswordBefore) {
            int userPos = urlString.indexOf("&user");
            int passwordSize = userPos - pos - 9;
            res = urlString.substring(0,pos+9) + String.join("", Collections.nCopies(passwordSize, "*")) + urlString.substring(userPos);
        }
        else {
            int passwordSize = (len - pos) - 9;
            res = urlString.substring(0, pos + 9) + String.join("", Collections.nCopies(passwordSize, "*")) ;
        }

        return res;

    }

}
