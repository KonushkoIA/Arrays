package Homework1_1;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,5,3,4,5,2,7,1};
        int prom;
        int naib = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > naib) {
                naib = i;
            }
        }
        prom = array[naib];
        array[naib]=array[0];
        array[0]=prom;
        System.out.println(Arrays.toString(array));
    }
}