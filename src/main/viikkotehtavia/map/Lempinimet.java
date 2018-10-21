package main.viikkotehtavia.map;

import java.util.TreeMap;

/**
 * Tässä tehtävässä sinun tehtäväsi on luoda TreeMap<String, String> ja lisätä siihen henkilöiden nimiä ja lempinimiä.
 * Henkilön nimi toimii avaimena ja lempinimi arvona. Lisää nimet kokoelmaan tässä järjestyksessä (huomioi kirjainkoko):
 * Nimi (avain)	Lempinimi (arvo)
 * Teemu	The Finnish Flash
 * Jari	Litti
 * Kaisa-Leena	Kappa
 * Koska käytössä on TreeMap, tulee sisällön tulostua avaimen mukaisessa aakkosjärjestyksessä.
 */
public class Lempinimet {

    public static void main(String[] args) {
        TreeMap<String, String> lempinimet = new TreeMap<>();
        lempinimet.put("Teemu", "The Finnish Flash");
        lempinimet.put("Jari", "Litti");
        lempinimet.put("Kaisa-Leena", "Kappa");

        // Koska käytössä on TreeMap, tulee sisällön tulostua avaimen mukaisessa aakkosjärjestyksessä.

        //Example output:
        //{Jari=Litti, Kaisa-Leena=Kappa, Teemu=The Finnish Flash}

        System.out.println(lempinimet);
    }

}
