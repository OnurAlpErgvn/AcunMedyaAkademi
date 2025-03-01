package Hafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("10 sayı girin:");
        for (int i = 0; i < 10; i++) numbers.add(scanner.nextInt());

        int max = numbers.get(0), min = numbers.get(0);
        for (int num : numbers) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("En büyük: " + max + "\nEn küçük: " + min);
    }
}
