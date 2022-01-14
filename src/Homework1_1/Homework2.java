package Homework1_1;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        int size = 20;
        int sum = 0;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < size; i++){
            if (array[i] % 2 != 0){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}