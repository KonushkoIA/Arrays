package Homework1_1;

import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int size = 20;
        double srarif;
        int sum = 0;
        int colel = 0;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < size; i++){
            if (array[i] > 20){
                colel = colel + 1;
                sum = sum + array[i];
            }
        }
        srarif = (double) sum / colel;
        System.out.println(srarif);
    }
}