package main.viikkotehtavia.periytyminen;

public class TaksiTesti {
    public static void main(String [] args) {
        Auto auto = new Auto("Opel", "ABC-123");
        Taksi taksi = new Taksi("Skoda", "DEF-456", "H123");
        auto.getRekisterinumero();
        taksi.getRekisterinumero();
        taksi.getTaksinumero();

    }
}
