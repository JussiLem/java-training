package main.viikkotehtavia.vaihtoehtorakenne;

import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
        /* Muuttujien esittely */
        int rikesakko;
        int ajettuNopeus;
        int nopeusRajoitus;
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna nopeusrajoitus: ");
        nopeusRajoitus = lukija.nextInt();

        System.out.print("Anna nopeutesi: ");
        ajettuNopeus = lukija.nextInt();

        int yliNopeus = ajettuNopeus - nopeusRajoitus;

        if (nopeusRajoitus <= 60 && yliNopeus >0 && yliNopeus <= 15) {
            System.out.println("Rikesakko on 170");
        } else if (nopeusRajoitus <= 60 && yliNopeus >15 && yliNopeus <= 20) {
            System.out.println("Rikesakko on 200");
        } else if (nopeusRajoitus <= 120 && yliNopeus > 0 && yliNopeus <= 15) {
            System.out.println("Rikesakko on 140");
        } else if (nopeusRajoitus <= 120 && yliNopeus > 15 && yliNopeus < 20) {
            System.out.println("Rikesakko on 200");
        } else if (nopeusRajoitus <= 120 && yliNopeus > 20) {
            System.out.println("Menee päiväsakoille");
        }
    }
}
