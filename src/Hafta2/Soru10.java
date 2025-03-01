package Hafta2;

import java.util.Arrays;

public class Soru10 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------");

        // Arrays.sort()
        Arrays.sort(numbers);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(numbers));
        System.out.println("----------------------");

        // Arrays.binarySearch()
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("5 sayısının indeksi: " + index);
        System.out.println("----------------------");

        // Arrays.copyOfRange()
        int[] newArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Kopyalanan dizi (1-4 arası): " + Arrays.toString(newArray));
        System.out.println("----------------------");

        // Arrays.equals()
        int[] numbers2 = {1, 2, 5, 6, 9};
        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Diziler eşit mi? " + isEqual);
        System.out.println("----------------------");

        // Arrays.fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Doldurulmuş dizi: " + Arrays.toString(filledArray));
    }
}
