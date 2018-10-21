package main.viikkotehtavia.vaihtoehtorakenne;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Pizzeria tarjoaa kolme pizzaa kahden hinnalla, halvimman pizzan saa siis kaupan päälle.
 * Tee ohjelma Pizza, joka kysyy kolmen pizzan hinnan (desimaalilukuja)
 * ja kertoo tämän jälkeen ostettujen pizzojen yhteishinnan sekä yksittäiselle pizzalle tulevan hinnan.
 * Ratkaise ongelma siten, että selvität ensin halvimman pizzan hinnan if-lauseiden avulla.
 * Vähennät sen kaikkien kolmen pizzan hinnasta
 *
 * summa = pizza1 + pizza2 + pizza3 - halvin;
 *
 * keskihinta = summa / 3;
 */
public class Pizza {
    public static void main(String[] args) {

        /* Muotoilee desimaalit */
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pizzojen hinnat (3): ");
        double pizza1 = lukija.nextDouble();
        double pizza2 = lukija.nextDouble();
        double pizza3 = lukija.nextDouble();

        if (pizza1 < pizza2 || pizza1 < pizza3) {
            pizza1 = 0;
        } else if (pizza2 < pizza1 || pizza2 < pizza3) {
            pizza2 = 0;
        } else {
            pizza3 = 0;
        }

        double maksettavaa = pizza1+pizza2+pizza3;
        double yksittainen = maksettavaa / 3;

        System.out.println("Maksettavaa: " + decimalFormat.format(maksettavaa));
        System.out.println("Yksittäisen hinta: " + decimalFormat.format(yksittainen));
    }
}
