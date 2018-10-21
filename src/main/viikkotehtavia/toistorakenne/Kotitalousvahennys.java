package main.viikkotehtavia.toistorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *  Laskee käyttäjän saaman kotitalousvähennyksen määrän. Työkorvausten euromääriä kysytään niin kauan,
 *  kunnes käyttäjä antaa korvauksen määräksi nolla. Kotitalousvähennyksen määrä on 45 % työkorvauksesta.
 *  Kotitalousvähennyksen enimmäismäärä on 2 400 euroa. Vähennyksen omavastuu on 100 euroa.
 *  Kotitalousvähennys lasketaan työkorvausten summa*45/100.0-omavastuu.
 */
public class Kotitalousvahennys {

    public static void main(String[] args) {

        double summa = 0;
        double omavastuu;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
        omavastuu = input.nextDouble();

        while (omavastuu != 0) {
            summa = summa + omavastuu;
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            omavastuu = input.nextDouble();
        }

        double vahennys = summa * 45 / 100 - 100;
        if (vahennys > 2400) {
            vahennys = 2400;
        } if (vahennys < 0) {
            vahennys = 0;
        }
        System.out.println("Kotitalousvähennyksen määrä on " + decimalFormat.format(vahennys) + " euroa");
        input.close();
    }

}
