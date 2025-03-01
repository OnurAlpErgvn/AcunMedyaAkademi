package Hafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("10 adet sayı girin:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) > numbers.get(i)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        System.out.println("Büyükten küçüğe sıralı sayılar: " + numbers);
    }
}
