package Homework1_2;

public class Homework3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum++;
            }
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}

