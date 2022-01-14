package Homework1_1;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int size = 8;
        int[] array = new int[size];
        Arrays.fill(array, 1);
        for (int j = 0; j < array.length; j++){
            if (j % 2 != 0){
                array[j] = 0;
            }
            System.out.println(array[j]);
        }
    }
}
