package Homework1_1;

public class Homework5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        for (int j = 0; j < array1.length; j++){
            array1[j] = j;
            System.out.print(array1[j] + " ");
        }
        System.out.println();
        for (int h = 0; h < array2.length; h++){
            array2[h] = h;
            System.out.print(array2[h] + " ");
        }
        System.out.println();
        for ( int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i] || array1.length != array2.length){
                System.out.println("Массивы не равны");
            } else {
                System.out.println("Массивы равны");
            }
            break;
        }
    }
}