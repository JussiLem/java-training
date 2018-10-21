package main.viikkotehtavia.luokkajaolio;

/**
 * luokan konstruktorille annetaan parametrina alkuarvo.
 * Esimerkin oliota laskuri luodessa laskurille välitetään parametrina arvo 10.
 * Esimerkin laskuri-olioon liittyvään oliomuuttujaan arvoasetetaan siis aluksi arvo 10.
 * Laskurin arvon voi tulostaa metodilla tulostaArvo().
 * Laskurilla tulee myös olla metodi vahene() joka vähentää laskurin arvoa yhdellä.
 */
public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // laskurin arvon on siis tarkoitus vähentyä yhdellä

        if(this.arvo > 0) {
            this.arvo = this.arvo - 1;
        }
    }
    // nollaa laskurin arvon
    public void nollaa() {
        this.arvo = 0;
    }
}