package main.viikkotehtavia.toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Kilometrikorvaus, joka laskee omalla autolla ajojen kilometrikorvaukset.
 * Ohjelma kysyy ajokilometrejä, kunnes käyttäjä antaa nollan.
 * Tämän jälkeen ohjelma näyttää ajetut kilometrit sekä ajoista maksettavan korvauksen.
 * Korvaus on 0.43 euroa per kilometri.
 */
public class Kilometrikorvaus {
    public static void main(String[] args) {
        int ajokilometrit;
        int summa = 0;

        DecimalFormat desimaaliMuotoilu = new DecimalFormat("0.00");
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
        ajokilometrit = lukija.nextInt();

        while (ajokilometrit != 0){
            summa = summa + ajokilometrit;
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            ajokilometrit = lukija.nextInt();
        }

        double korvaus = summa * 0.43;
        System.out.println("Yhteensä " + summa + " kilometriä");
        System.out.println("Korvaus on " + desimaaliMuotoilu.format(korvaus) + " euroa");
        lukija.close();

    }

}
