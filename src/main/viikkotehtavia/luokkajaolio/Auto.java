package main.viikkotehtavia.luokkajaolio;

public class Auto {
    private String merkki;
    private int kilometrit;

    public Auto(String merkki) {
        this.merkki = merkki;
        this.kilometrit = 0;
    }

    public void aja(int kilometrit) {
        this.kilometrit += kilometrit;
    }

    @Override
    public String toString() {
        return this.merkki + ", " + this.kilometrit + " km.";
    }
}