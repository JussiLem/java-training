package main.viikkotehtavia.luokkajaolio;

public class Song {
    /*instanssimuuttujat:
            private String title
            private Artist artist
            private int year (kappaleen julkaisuvuosi)
            private int length (kappaleen kesto sekunteina)*/
    private String title;
    private Artist artist;
    private int year;
    private int length;

    public Song() {
    }

    @Override
    public String toString() {
        if (title == null) {
            return String.valueOf(artist);
        } if (artist == null) {
            return title;
        } else {
            return title + " by " + artist ;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //konstruktorit:
    //public Song()
    //Huom! Luokalla on oltava tämä tyhjä konstruktori, jolla ei ole lainkaan parametrimuuttujia.

}
