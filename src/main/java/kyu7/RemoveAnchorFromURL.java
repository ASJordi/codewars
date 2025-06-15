package kyu7;

public class RemoveAnchorFromURL {

    public static String removeUrlAnchor(String url) {
        return url.contains("#") ? url.substring(0, url.indexOf("#")) : url;
    }

}
