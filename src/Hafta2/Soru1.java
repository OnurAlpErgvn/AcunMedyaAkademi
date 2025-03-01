package Hafta2;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Lütfen 10 adet tam sayı girin:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println("\nDizinin ortalaması: " + average);

        System.out.println("50’den büyük olan sayılar:");
        for (int num : numbers) {
            if (num > 50) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
