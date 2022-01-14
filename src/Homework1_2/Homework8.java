package Homework1_2;

public class Homework8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int celar3 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.floor(Math.random() * 9);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.floor(Math.random() * 9);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array3[i] = (double) array1[i] / array2[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array3.length; i++) {
            if (array3[i] % 1 == 0) {
                celar3++;
            }
        }
        System.out.println(celar3);
    }
}
