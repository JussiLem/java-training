package main.viikkotehtavia.toistorakenne;

import java.util.Scanner;

/**
 * Kysyy käyttäjältä yhden kokonaisluvun, ja laskee onko käyttäjän syöttämä luku alkuluku.
 * Voit ratkaista tehtävän tekemällä toistorakenteen,
 * jossa kokeilet jakaa käyttäjän antamaa lukua sitä pienemmillä kokonaisluvuilla.
 * Aloita luvusta 2 ja jatka kokeilemista luku kerrallaan, kunnes saavutat sopivan ylärajan,jonka jälkeen jako ei voi enää mennä tasan.
 * Jos jollain kierroksella jako menee tasan, ei käyttäjän antama luku ole alkuluku.
 * Jos puolestaan toistorakenne päättyy ilman, että yksikään jako on mennyt tasan, annettu luku on alkuluku.
 */

public class Alkuluku {
    public static void main(String[] args) {
        int temp;
        boolean onKokonaisluku=true;
        Scanner input = new Scanner(System.in);

        System.out.print("Syötä jokin positiviinen kokonaisluku: ");
        int kokonaisluku = input.nextInt();
        input.close();
        for (int i = 2; i <= kokonaisluku / 2; i++) {
            temp = kokonaisluku % i;
            if (temp == 0) {
                onKokonaisluku = false;
                break;
            }
        }
        // Jos onKokonaisluku
        if(onKokonaisluku) {
            System.out.println("Luku " + kokonaisluku + " on alkuluku.");
        } else {
            System.out.println("Luku " + kokonaisluku + " ei ole alkuluku.");
        }

    }

}