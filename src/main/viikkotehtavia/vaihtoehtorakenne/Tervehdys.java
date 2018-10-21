package main.viikkotehtavia.vaihtoehtorakenne;

import java.util.Scanner;

/**
 * Kirjoita luokka Tervehdys ja siihen main-metodi, joka tulostaa kellonajasta riippuen erilaisen tervehdyksen.
 * Ohjelmasi tulee ensin kysyä käyttäjältä mikä tunti on ja sen jälkeen tulostaa tervehdys.
 *
 */
public class Tervehdys {

    public static void main(String[] args) {
        int kellonAika;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mitä kello on? Anna tunnit: ");
        kellonAika = scanner.nextInt();
        if (kellonAika < 7 || kellonAika > 22) {
            System.out.println("Hyvää yötä!");
        } if (kellonAika >= 17 && kellonAika < 22) {
            System.out.println("Hyvää iltaa!");
        } if (kellonAika >= 10 && kellonAika < 17) {
            System.out.println("Hyvää päivää!");
        } else if(kellonAika >= 7 && kellonAika < 10) {
            System.out.println("Hyvää huomenta!");
        }
    }
}
