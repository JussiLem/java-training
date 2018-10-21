package main.viikkotehtavia.metodit;

import java.util.Scanner;

public class SuoKuokkaJaJava {
    public static void main(String[] args) {
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu tulostaTeksti-metodia toistorakenteen avulla useita kertoja

        Scanner input = new Scanner(System.in);
        System.out.print("Kuinka monta kertaa tulostetaan? ");
        int amount = input.nextInt();
        while (amount > 0) {
            tulostaTeksti();
            amount--;
        }
    }

    public static void tulostaTeksti() {
        // kirjoita tekstin tulostaminen tähän
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }
}
