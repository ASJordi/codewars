package kyu7;

import java.util.HashMap;

public class Dictionary {

    private final HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary() {
    }

    public void newEntry(String key, String value) {
        this.dictionary.put(key, value);
    }

    public String look(String key) {
        return this.dictionary.getOrDefault(key, "Cant find entry for " + key);
    }
}
