package main.viikkotehtavia.toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Kysyy luotolle tehdyn ostoksen hinnan sekä osamaksukuukausien määrän.
 * Ohjelma tulostaa kunkin kuukauden maksettavan erän suuruuden sekä jäljellä olevan luoton määrän.
 */
public class Luottolaskuri {
    public void naytaEria(double hinta, int lukumaara) {
        int counter;
        double erahinta;
        double jaljella;
        DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

        final int tilinhoitoMaksu = 4;
        for (int i = 0; i < lukumaara; i++) {
            counter = i + 1;
            erahinta = hinta / lukumaara + tilinhoitoMaksu;
            jaljella = hinta - (hinta / lukumaara) * counter;
            System.out.println(""+counter+". erä " + kaksiDesimaalia.format(erahinta) + " euroa, luottoa jäljellä " +
                    kaksiDesimaalia.format(jaljella) + " euroa");

        }

    }

    public static void main(String[] args) {
        Luottolaskuri ohjelma = new Luottolaskuri();
        Scanner input = new Scanner(System.in);
        double hinta;
        int lukumaara;
        System.out.print("Anna luotollisen ostoksen hinta: ");
        hinta = input.nextDouble();
        System.out.print("Anna kuukausierien lukumäärä: ");
        lukumaara = input.nextInt();
        ohjelma.naytaEria(hinta, lukumaara);
    }
}
