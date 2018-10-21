package main.viikkotehtavia.metodit;

public class Lyhentaja {

    public static String lyhennaNimi(String etunimi, String sukunimi) {
        return etunimi.substring(0, 1) + ". " + sukunimi;
    }
}