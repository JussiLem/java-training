package main.viikkotehtavia.luokkajaolio;

import java.util.ArrayList;

public class Playlist {
    //yksityiset instanssimuuttujat:
    //ArrayList<Song> songs

    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist() {
    }

    //lisää annetun kappaleen songs-listalle viimeiseksi
    void addSong(Song song) {
            this.songs.add(song);

    }
    /*palauttaa listalta kohdassa index olevan kappaleen, tai null jos kohdassa ei ole kappaletta.
    Vertaa tässä metodissa annettua indeksiä songs-listan pituuteen ennen kuin kutsut listan get-metodia!*/
    Song getSong(int index) {
        if (index < this.songs.size()) {
            return this.songs.get(index);
        } else {
            return null;
        }
    }

    //laskee soittolistan kappaleiden yhteiskeston sekunteina ja palauttaa tuloksen
    int getTotalLength() {

        return songs.size();
    }

    /*Playlist-luokan toString-metodin tulee palauttaa merkkijono, jossa kutakin kappaletta kohden on yksi rivi.
    Rivin tulee alkaa numerolla ja kaksoispisteellä,
    ja niiden jälkeen tulee olla kappaleen toString-metodin palauttama merkkijonoesitys.
    Huomaa, että toString ei saa tulostaa mitään, vaan sen tulee palauttaa muodostettu merkkijono. Esimerkiksi:
    1: Never Gonna Give You Up by Rick Astley
    2: Hooked on a Feeling by David Hasselhoff*/
    @Override
    public String toString() {

        String binaryNumber = null;
        for (Song song : songs) {
            binaryNumber += songs.toString();
        }
        return binaryNumber == null ? null : binaryNumber.toString();
    }

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        Artist artist = new Artist("Rick Astley", 1966);

        Song song = new Song();
        song.setTitle("Never Gonna Give You Up");
        song.setYear(1987);
        song.setLength(215);
        song.setArtist(artist);

        playlist.addSong(song);

        System.out.println(playlist);
        System.out.println(playlist.getTotalLength());

        Artist artist2 = new Artist("David Hasselhoff", 1952);

        Song song2 = new Song();
        song2.setTitle("Hooked on a Feeling");
        song2.setYear(1997);
        song2.setLength(211);
        song2.setArtist(artist2);

        playlist.addSong(song2);

        System.out.println(playlist);
        System.out.println(playlist.getTotalLength());


    }

}
