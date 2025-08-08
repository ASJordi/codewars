package kyu7;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class URLTimestamps {

    private final Map<String, Long> map = new HashMap<>();

    public void setTimestamp(URL url, long timestamp) {
        map.put(url.toExternalForm(), timestamp);
    }

    public long getTimestamp(URL url) {
        return map.getOrDefault(url.toExternalForm(), -1L);
    }

}
