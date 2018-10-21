package main.viikkotehtavia.perusteita;
import java.util.Scanner;


public class HeiEtunimi {

    public static void main(String[] args) {
        String etunimi;
        Scanner in = new Scanner(System.in);

        System.out.print("Syötä etunimi: ");
        etunimi = in.nextLine();
        System.out.println("Hei " + etunimi+"!");

    }
}
