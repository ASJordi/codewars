package kyu7;

import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> currentListeners = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int howMany(ArrayList<String> listeners){
        int newListeners = 0;
        for (String listener : listeners){
            if (!this.currentListeners.contains(listener.toLowerCase())){
                this.currentListeners.add(listener.toLowerCase());
                newListeners++;
            }
        }
        return newListeners;
    }

}
