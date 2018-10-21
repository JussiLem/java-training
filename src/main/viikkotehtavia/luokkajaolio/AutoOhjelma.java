package main.viikkotehtavia.luokkajaolio;
/**
 * Luo uusi "Tesla"-merkkinen auto ja laita viittaus tähän olioon talteen muuttujaan
 * Luo toinen "BMW"-merkkinen auto ja laita viittaus tähän olioon talteen eri muuttujaan
 * Kutsu Teslan aja-metodia arvolla 100.
 * Kutsu BMW:n aja-metodia arvolla 98.
 * Kutsu Teslan aja-metodia arvolla 23.
 * Tulosta Teslan merkkijonoesitys (toString) omalle rivilleen
 * Tulosta BMW:n merkkijonoesitys (toString) omalle rivilleen
 */
public class AutoOhjelma {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Tesla");
        auto1.aja(100);

        Auto auto2 = new Auto("BMW");
        auto2.aja(98);

        auto1.aja(23);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

    }
}

