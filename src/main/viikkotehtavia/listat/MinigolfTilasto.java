package main.viikkotehtavia.listat;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Tee ohjelma, jolla kaveriporukka voi tehdä tilaston pelistään.
 * Ohjelma kysyy pelaajien lukumäärän ja sen jälkeen kunkin pelaajan lyöntien määrän kierroksella.
 * Lopuksi ohjelma kertoo, mikä on lyöntien keskiarvo, pienin ja suurin lyöntimäärä sekä,
 * kuinka moni pelasi pelinsä alle keskiarvon.
 * Pienimmän ja suurimman saan selvitettyä, kun lajittelee taulukon. Pienin on indeksillä 0 ja
 * suurin indeksillä pelaajien lukumäärä-1.
 */
public class MinigolfTilasto {
    private DecimalFormat decimal = new DecimalFormat("0.00"); // for the average

    public static void main(String[] args) {
        new MinigolfTilasto();

    }
    private MinigolfTilasto() {
        System.out.println("Anna pelaajien lukumäärä: ");
        Scanner input = new Scanner(System.in);
        int players = input.nextInt();
        int [] results = new int[players];
        int total = 0;
        for (int index = 0; index < results.length; index++) {
            System.out.print("Anna pelaajan " + (index + 1) + ". tulos:");
            results[index] = input.nextInt();
            total += results[index];
        }
        getResults(results, total);
    }

    private void getResults(int[] results, int total) {
        double average = total / (double) results.length;
        int min = 0;
        int max = 0;
        int belowAverage = 0;
        for (int index = 0; index < results.length; index++) {
            if (index == 0) {
                min = results[0];
                max = results[0];
            } if (results[index] < min) {
                min = results[index];
            } else if (results[index] > max) {
                max = results[index];
            } if (results[index] < average) {
                belowAverage++;
            }
        }
        System.out.println("Pelien keskiarvo oli " + decimal.format(average));
        System.out.println("Pienin peli oli " + min);
        System.out.println("Suurin peli oli " + max);
        System.out.println(belowAverage + " pelaajalla oli keskiarvoa pienempi tulos");
    }
}
