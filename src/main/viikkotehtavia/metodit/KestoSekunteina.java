package main.viikkotehtavia.metodit;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Ohjelmasi tulee kysyä main-metodissa käyttäjältä erikseen tunnit, minuutit ja sekunnit,
 * ja sen jälkeen kutsua kestoSekunteina-metodia saaduilla arvoilla. Tulosta lopuksi saamasi tulos.
 */
public class KestoSekunteina {
    private static int sekunnit;
    private static int minuutit;
    private static int tunnit;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna tunnit: ");
        tunnit = input.nextInt();
        System.out.print("Anna minuutit: ");
        minuutit = input.nextInt();
        System.out.print("Anna sekunnit: ");
        sekunnit = input.nextInt();
        System.out.printf("Yhteensä %s sekuntia.%n", kestoSekunteina());
    }
    /**
     * kestoSekunteina-metodi saa parametriarvoinaan 3 kokonaislukua: tunnit, minuutit ja sekunnit.
     * Metodin tulee laskea annettujen aikayksiköiden kesto yhteensä sekunteina ja palauttaa laskun tulos kokonaislukuna.
     * Huomaa, että metodi ei saa kysyä syötettä eikä tulostaa mitään,
     * vaan sen täytyy saada kesto parametriarvoina ja palauttaa laskun tulos paluuarvona.
     */
    private static int kestoSekunteina() {
        int hoursToSeconds = (int) TimeUnit.HOURS.toSeconds(tunnit);
        int minutesToSeconds = (int) TimeUnit.MINUTES.toSeconds(minuutit);
        int totalSeconds = sekunnit;
        return hoursToSeconds + minutesToSeconds + totalSeconds;
    }
}
