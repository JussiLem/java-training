package main.viikkotehtavia.periytyminen;

public class OpiskelijaTesti {
    public static void main(String[] args) {
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        olli.opiskele();
        System.out.println(olli);
    }

}
