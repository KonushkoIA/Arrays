package Homework1_2;

public class Homework7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max ) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальное " + max + ", его индекс " + index);
    }
}
