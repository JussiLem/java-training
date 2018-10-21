package main.viikkotehtavia.merkkijono;

import java.util.Scanner;

public class MerkkijonojenVertailu {
    public static void main(String[] args) {

        System.out.println("Syötä kaksi merkkijonoa.");
        Scanner lukija = new Scanner(System.in);
        String eka = lukija.nextLine();
        String toka = lukija.nextLine();

        if (eka.equals(toka)) {
            System.out.println("Syötetyt merkkijonot olivat samat!");
        } else {
            System.out.println("Syötetyt merkkijonot eivät olleet samat!");
        }
    }
}
