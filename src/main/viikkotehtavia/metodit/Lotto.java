package main.viikkotehtavia.metodit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * hyödyntää aikaisemmassa tehtävässä kirjoittamaasi Leikkaus-luokkaa.
 * Ohjelmasi tulee ensin pyytää käyttäjältä oikea rivi sekä lisänumero ja niiden jälkeen käyttäjän oma lottorivi.
 * Oikea rivi ja lisänumero syötetään samalle riville välilyönneillä eroteltuina.
 */
public class Lotto {

    public static void main(String[] args) {
        List<Integer> oikeaRivi; // 7 + 1 numeroa
        List<Integer> tarkistettavaRivi; // 7 numeroa
        oikeaRivi = Arrays.asList(4, 12, 14, 17, 23, 33, 35, 8);
        tarkistettavaRivi = Arrays.asList(4, 6, 7, 8, 12, 35, 28);

        List<Integer> oikeaTulos = Leikkaus.laskeLeikkaus(oikeaRivi, tarkistettavaRivi);
        Integer tuloksenKoko = oikeaTulos.size();
        List<Integer> lisaNumero = oikeaTulos.stream().distinct().collect(Collectors.toList());
        String formattedString = tuloksenKoko.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();           //remove trailing spaces from partially initialized arrays
        String lisanumeroMuoto = lisaNumero.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();           //remove trailing spaces from partially initialized arrays
        if (oikeaTulos.contains(8))
            System.out.println(tuloksenKoko + " oikein." + lisanumeroMuoto);
        else {
            System.out.println(tuloksenKoko + " oikein. ");

        }
    }

}
