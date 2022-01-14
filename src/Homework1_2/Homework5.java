package Homework1_2;

public class Homework5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double srarif1 = 0;
        double srarif2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 15);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 15);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            srarif1 = srarif1 + array1[i];
        }
        srarif1 = (double) srarif1 / array1.length;
        for (int i = 0; i < array2.length; i++) {
            srarif2 = srarif2 + array2[i];
        }
        srarif2 = (double) srarif2 / array2.length;
        if (srarif1 > srarif2) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        else if (srarif2 > srarif1) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        else if (srarif1 == srarif2) {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
