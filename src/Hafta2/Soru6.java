package Hafta2;

import java.util.ArrayList;
import java.util.Random;

public class Soru6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            numbers.add(num);
            if (num % 2 == 0) evenNumbers.add(num);
        }

        System.out.println(numbers);
        System.out.println(evenNumbers);
    }
}
