package main.viikkotehtavia.metodit;

/**
 *  kaksi julkista staattista metodia: summa ja erotus.
 *  Määrittele metodit siten, että ne saavat parametriarvoinaan 2 double-tyyppistä liukulukua ja
 *  että ne palauttavat tuloksena double-tyyppisen liukuluvun.
 *  Summa-metodin täytyy palauttaa annettujen lukujen summa ja erotus vastaavasti palauttaa erotuksen
 *  (ensimmäinen luku - toinen luku).
 *  Huomaa, että et saa tulostaa näissä metodeissa mitään, vaan tulos on palautettava pois metodista.
 */
public class Laskuoperaatiot {

    public static double summa(double eka, double toka) {

        return eka + toka;
    }

    public static double erotus(double eka, double toka) {

        return eka - toka;
    }
}
