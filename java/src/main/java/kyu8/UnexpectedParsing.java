package kyu8;

import java.util.*;

public class UnexpectedParsing {

    public static HashMap <String, String> getStatus(boolean isBusy) {

        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;

    }

}
