package main.viikkotehtavia.listat;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class SanaLista {

    private List<String> sanaLista = new ArrayList<String>();

    private void lisaaSana() {

    }

    private void listaaSanat() {

    }

    private void laskeSanat() {

    }

    private void poistaSana() {

    }

    public static void main(String[] args) {
        SanaLista ohjelma = new SanaLista();

        int valinta;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Anna seuraava komento: ");
            System.out.println("Anna seuraava komento: ");
            System.out.println("Anna seuraava komento: ");
            System.out.println("Anna seuraava komento: ");
            System.out.println("Anna seuraava komento: ");
            System.out.print("Anna valintasi: ");

            valinta = input.nextInt();

            switch (valinta) {
                case 1:
                    ohjelma.lisaaSana();
                    break;

                case 2:
                    ohjelma.listaaSanat();
                    break;

                case 3:
                    ohjelma.laskeSanat();
                    break;

                case 4:
                    ohjelma.poistaSana();
                    break;
            }
        } while (valinta != 0);
    }
}