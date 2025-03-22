package Ocak.Hafta4;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), t = 0;
        for (int i = 1; i <= n; t += i++);
        System.out.println(t);
    }
}
