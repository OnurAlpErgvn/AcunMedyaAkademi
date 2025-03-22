package Ocak.Hafta1;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();
        System.out.println("Merhaba, " + ad );
        scanner.close();
    }
}
