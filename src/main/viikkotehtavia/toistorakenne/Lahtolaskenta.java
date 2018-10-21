package main.viikkotehtavia.toistorakenne;

public class Lahtolaskenta {
    public static void main(String[] args) {
        int i;
        for (i = 100; i > 0; i--) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
