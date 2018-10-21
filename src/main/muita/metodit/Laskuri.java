package main.muita;

public class Laskuri {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z;

        z = summa(x, y);

        System.out.println(z);
    }

    public static int summa(int eka, int toka) {
        int sum;
        sum = eka + toka;

        return sum;
    }
}
