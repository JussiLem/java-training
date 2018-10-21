package main.viikkotehtavia.merkkijono;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 Toteuta luokka Laskin, joka tarjoaa plus, miinus, kerto sekä jakolaskutoiminnallisuuden.
 Laskimen tulee toimia muutoin kokonaisluvuilla, mutta jakolaskun tulos tulee esittää double-tyyppisenä,
 eikä sitä saa pyöristää eikä muotoilla.
 */

public class Laskin {

    public static void main(String[] args) {
        double ekaLuku;
        double tokaLuku;
        String operaattori;

        DecimalFormat format = new DecimalFormat("0");
        Scanner input = new Scanner(System.in);

        System.out.print("Anna ensimmäinen luku: ");
        ekaLuku = input.nextDouble();

        System.out.print("Anna toinen luku: ");
        tokaLuku = input.nextDouble();

        System.out.print("Anna operaatio: ");
        operaattori = input.next();

        if (operaattori.equals("+")){
           double tulos = ekaLuku + tokaLuku;
           System.out.println(format.format(ekaLuku) + " + " + format.format(tokaLuku) + " = " + format.format(tulos));
        } if (operaattori.equals("-")) {
            double tulos = ekaLuku - tokaLuku;
            System.out.println(format.format(ekaLuku) + " - " + format.format(tokaLuku) + " = " + format.format(tulos));
        } if (operaattori.equals("*")) {
            double tulos = ekaLuku * tokaLuku;
            System.out.println(format.format(ekaLuku) + " * " + format.format(tokaLuku) + " = " + format.format(tulos));
        } if (operaattori.equals("/")) {
            double tulos = ekaLuku / tokaLuku;
            System.out.println(format.format(ekaLuku) + " / " + format.format(tokaLuku) + " = " + tulos);

        }
    }
}
