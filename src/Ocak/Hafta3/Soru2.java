package Ocak.Hafta3;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n == 0 ? "Sıfır" : (n > 0 ? "Pozitif" : "Negatif"));
    }
}
