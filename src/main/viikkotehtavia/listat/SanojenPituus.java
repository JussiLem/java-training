package main.viikkotehtavia.listat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Tallenna alla esitetty tehtäväpohja itsellesi tiedostoon SanojenPituus.java.
  Tehtäväsi on jatkokehittää koodia siten, että sanojen kysymisen jälkeen
  ohjelmasi käy läpi taulukon käyttäjän antamista sanoista ja laskee sanojen yhteispituuden.
  Aseta pituuksien summa yhteisPituus-nimiseen muuttujaan.
  Käytä listan läpikäymiseen toistorakennetta.
 */

public class SanojenPituus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> sanat = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Syötä sana " + i + "/5: ");
            sanat.add(lukija.nextLine());
        }

        int yhteisPituus = 0;

        // Kirjoita koodisi tähän
        for (String string : sanat) {
            //yhteisPituus = sanat.get(string);
            System.out.println("\nSanojen yhteispituus on: " + yhteisPituus);
        }

        lukija.close();
    }
}