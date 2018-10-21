package main.viikkotehtavia.metodit;

import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kirjoita vuosiluku: ");
        int vuosi = lukija.nextInt();

        if (onkoKarkausvuosi(vuosi)) {
            System.out.println("Vuosi " + vuosi + " on karkausvuosi.");
        } else {
            System.out.println("Vuosi " + vuosi + " ei ole karkausvuosi.");
        }

    }

    /**
     * onkoKarkausvuosi-niminen metodi, joka saa parametriarvonaan yhden vuosiluvun ja palauttaa tiedon siitä,
     * onko annettu vuosi karkausvuosi.
     * Karkausvuoden laskennassa täytyy ottaa huomioon yllä esitetyt Gregoriaanisen kalenterin karkausvuosisäännön poikkeukset.
     *
     * @param vuosi
     */
    public static boolean onkoKarkausvuosi(int vuosi) {
        if (vuosi % 4 == 0) {
            if (vuosi % 100 == 0) {
                if (vuosi % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}