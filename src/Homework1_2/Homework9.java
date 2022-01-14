package Homework1_2;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int buf = 0;
        boolean sort = false;
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        while(!sort) {
            sort = true;
            for ( int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    sort = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
