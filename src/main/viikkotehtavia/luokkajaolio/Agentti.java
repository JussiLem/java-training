package main.viikkotehtavia.luokkajaolio;

public class Agentti {

    private String etunimi;
    private String sukunimi;

    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    @Override
    public String toString() {
        return "my name is " + this.sukunimi + ", " + this.etunimi + " " + this.sukunimi;
    }

    public static void main(String[] args) {
//  System.out.println("My name is " + sukunimi + ", " + etunimi + " " + sukunimi);
        Agentti bond = new Agentti("James", "Bond");

        bond.toString();
        System.out.println(bond);

        Agentti ionic = new Agentti("Ionic", "Bond");
        System.out.println(ionic); // Tulostaa: My name is Bond, Ionic Bond
    }


}
