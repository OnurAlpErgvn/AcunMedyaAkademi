package Hafta2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("10 adet kelime girin:");
        for (int i = 0; i < 10; i++) {
            words.add(scanner.nextLine());
        }

        Collections.sort(words);
        System.out.println(words);
    }
}
