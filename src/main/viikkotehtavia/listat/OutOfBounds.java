package main.viikkotehtavia.listat;

import java.util.ArrayList;

public class OutOfBounds {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(10);

        int count = 100 * 400;
        while (count > 0){
            array.add( 0 );
            count = count - 1;
            array.add(count, 2);
        }

        array.add(2, count);
    }
}
