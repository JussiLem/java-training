package main.viikkotehtavia.merkkijono;

import java.util.Scanner;

/**
 * Tee ohjelma OsoiteTarra, joka kysyy käyttäjältä etu- ja sukunimen, katuosoitteen, postinumeron ja postitoimipaikka.
 * Ohjelma näyttää kyseiset tiedot kolmelle riville samaan tapaan kuin osoitetarroissa.
 * Näytä käyttäjän antamat tiedot siten, ettei tekstien alussa ja lopussa ole turhia välilyöntejä.
 * Etu- ja sukunimi sekä katuosoite alkavat suurella kirjaimella, muut merkit ovat pieniä.
 * Postitoimipaikka näytetään suurilla kirjaimilla.Alla on esimerkki, miten etunimi voidaan muuntaa haluttuun muotoon
 */
public class OsoiteTarra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna etu- ja sukunimi: ");
        String etunimi = input.next();
        etunimi = etunimi.trim();
        String sukunimi = input.nextLine();
        sukunimi = sukunimi.trim();

        String ekaKirjain = etunimi.substring(0, 1).toUpperCase();
        String loppuNimi = etunimi.substring(1).toLowerCase();
        etunimi = ekaKirjain + loppuNimi;

        ekaKirjain = sukunimi.substring(0, 1).toUpperCase();
        loppuNimi = sukunimi.substring(1).toLowerCase();
        sukunimi = ekaKirjain + loppuNimi;

        System.out.print("Anna katuosoite: ");
        String katuosoite = input.nextLine();
        katuosoite = katuosoite.trim();
        String ekaOsoite = katuosoite.substring(0 ,1).toUpperCase();
        String loppuOsoite = katuosoite.substring(1).toLowerCase();
        katuosoite = ekaOsoite + loppuOsoite;

        System.out.print("Anna postinumero ja postitoimipaikka: ");
        String postinumero = input.next();
        postinumero = postinumero.trim();
        String postitoimipaikka = input.nextLine();
        postitoimipaikka = postitoimipaikka.trim();

        postitoimipaikka = postitoimipaikka.toUpperCase();

        System.out.println(etunimi + " " + sukunimi);
        System.out.println(katuosoite);
        System.out.println(postinumero + " " + postitoimipaikka);

    }
}
