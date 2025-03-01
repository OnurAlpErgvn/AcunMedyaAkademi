package Hafta2;

public class Soru3 {
    public static void main(String[] args) {
        int[] numbers = {9, -5, 8, -3, 7, -2, 6, -1};
        int positiveSum = 0;
        int negativeSum = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveSum += num;
            } else {
                negativeSum += num;
            }
        }

        System.out.println("Pozitif sayıların toplamı: " + positiveSum);
        System.out.println("Negatif sayıların toplamı: " + negativeSum);
    }
}

