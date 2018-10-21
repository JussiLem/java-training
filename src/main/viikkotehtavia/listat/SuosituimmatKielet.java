package main.viikkotehtavia.listat;
import java.util.ArrayList;
import java.util.List;

/**
 * Tässä tehtävässä sinun tulee kirjoittaa luokka SuosituimmatKielet,
 * jonka main-metodissa luot uuden String-tyyppisen listan.
 * Lisää listalle edellä mainitut ohjelmointikielien nimet suosituimmuusjärjestyksessä.
 * Lopuksi tulosta lista antamalla se parametrina println-metodille, esim: System.out.println(kielet);
 */
public class SuosituimmatKielet {

    public static void main(String[] args) {
        List<String> ohjelmointikielet = new ArrayList<>();

        ohjelmointikielet.add(0 ,"JavaScript");
        ohjelmointikielet.add(1, "Python");
        ohjelmointikielet.add(2,"Java");
        ohjelmointikielet.add(3,"Ruby");
        ohjelmointikielet.add(4,"PHP");

        System.out.println("["+ohjelmointikielet.get(0)+ ", " + ohjelmointikielet.get(1) +", " +
                ohjelmointikielet.get(2) +", " + ohjelmointikielet.get(3) +", " + ohjelmointikielet.get(4)+"]");
        /*
        for (String anOhjelmointikielet : ohjelmointikielet) {
            System.out.println("["+anOhjelmointikielet+"]");
        }
*/
    }
}
