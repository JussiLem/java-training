package main.viikkotehtavia.vaihtoehtorakenne;

import java.util.Scanner;

/**
 * Tee ohjelma Ylinopeus.java, joka kysyy käyttäjältä kokonaisluvun ja tulostaa merkkijonon "Ylinopeussakko!"
 * jos luku on suurempi kuin 120. Jos annettu luku on 120 tai vähemmän, ohjelmasi ei tule tulostaa mitään.
 *
 * Esim:
 * Kerro nopeus: 135
 * Ylinopeussakko!
 **/

public class Ylinopeus {
    public static void main(String[] main) {
        int nopeus;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kerro nopeus: ");
        nopeus = scanner.nextInt();
        if (nopeus > 120) {
            System.out.println("Ylinopeussakko!");
        }
    }

}
