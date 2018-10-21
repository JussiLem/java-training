package main.viikkotehtavia.perusteita;

import java.util.Scanner;
/**
 * Ohjelma kysyy ajetut kilometrit, auton kulutuksen per 100 km,
 * bensan litrahinnan sekä kimppakyytiläisten lukumäärän.
 * Ohjelma laskee edellä kerrotuista tiedoista, kuinka paljon jokainen maksaa bensasta.
 * Muotoile vastaus kahdella desimaalilla.
 *
 * Esimerkiksi jos ajetut kilometri on 500.0, kulutus on 7.0 litraa/100km,
 * polttoaine maksaa 1.690 euroa/litra ja kimppakyytiläisiä on kolme,
 * jokainen maksaa 19.72 (500.0 * 7.0 / 100.0 * 1.690 /3).
 * */

public class KimppaKyyti {
    public static void main(String[] args) {
        double kilometrit;
        double kulutus;
        double polttoaine;
        int henkilot;
        Scanner in = new Scanner(System.in);
        System.out.print("Anna ajetut kilometrit: ");
        kilometrit = in.nextDouble();

        System.out.print("Anna kulutus per 100 km: ");
        kulutus = in.nextDouble();

        System.out.print("Anna polttoaineen litrahinta: ");
        polttoaine = in.nextDouble();

        System.out.print("Anna kimppakyytiläisten lukumäärä: ");
        henkilot = in.nextInt();

        double kustannukset = (kilometrit * kulutus / 100.0 * polttoaine / henkilot);

        System.out.print("Bensakustannus per henkilö on ");
        System.out.printf("%.2f", kustannukset);
        System.out.print("euroa.");
    }
}
