package Homework1_2;

public class Homework1 {
    public static void main(String[] args) {
        int prom = 0;
        int[] array1 = new int[21];
        int[] array2 = new int[11];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        for (prom = 0; prom < array2.length; prom++) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] % 2 == 0) {
                    array2[prom] = array1[i];
                    prom++;
                }
            }
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
