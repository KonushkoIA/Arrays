package Homework1_1;

public class Homework6 {
    public static void main(String[] args) {
        int naim = 327687;
        int[] array = new int[]{1,8,5,3,3,4,5,6,2,1,10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] < naim) {
                naim = array[i];
            }
        }
        System.out.println(naim);
    }
}