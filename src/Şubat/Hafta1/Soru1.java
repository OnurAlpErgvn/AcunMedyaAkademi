package Şubat.Hafta1;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Dizi elemanları:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        scanner.close();
    }
}
