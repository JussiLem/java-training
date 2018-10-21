package main.viikkotehtavia.metodit;

import java.util.Scanner;

/**
 * Hyödyntää annetun luokan valmista metodia käyttäjän nimen lyhentämiseen.
 * Uuden luokan main-metodissa sinun tulee ensin kysyä käyttäjän nimeä, lyhentää se valmiilla metodilla,
 * ja lopuksi tulostaa lyhennetty nimi.
 */
public class NimenLyhentaja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Syötä etu- ja sukunimi: ");
        String kokoNimi = input.nextLine();
        while (!kokoNimi.isEmpty()) {
        //    Lyhentaja.lyhennaNimi();
        }

    }
}
