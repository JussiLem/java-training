package main.viikkotehtavia.perusteita;

import java.util.Scanner;
/**
 Ohjelma kysyy käyttäjältä tuotteen alentamattoman hinnan (desimaaliluku) sekä alennusprosentin (kokonaisluku).
 Tämän jälkeen ohjelma kertoo tuotteen alennetun hinnan. Muotoile vastaus kahdella desimaalilla.

 Alennettu hinta lasketaan: hinta * (100.0 - alennusprosentti) / 100.0

 Esimerkiksi:
 Anna alentamaton hinta: 150,0
 Anna alennusprosentti: 10
 Alennettu hinta on 135,00
 */
public class Alennus {

    public static void main(String args[]) {
        double hintaAlentamaton;
        int alennusProsentti;
        Scanner in = new Scanner(System.in);

        System.out.println("Anna alentamaton hinta: ");
        hintaAlentamaton = in.nextDouble();
        System.out.println("Anna alennusProsentti: ");
        alennusProsentti = in.nextInt();

        double hintaAlennettu =  hintaAlentamaton * (100.0 - alennusProsentti) / 100;


        System.out.printf("Alennettu hinta on %.2f", hintaAlennettu);
    }
}
