package Hafta1;

import java.util.Scanner;

public class Öğrenci_Ders_Notları {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplamNot = 0;
        int enYuksek = 0;
        int enDusuk = 100;
        int dusukNotSayisi = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". dersin notunu giriniz: ");
            int not = scanner.nextInt();
            toplamNot += not;

            if (not > enYuksek) {
                enYuksek = not;
            }
            if (not < enDusuk) {
                enDusuk = not;
            }
            if (not < 30) {
                dusukNotSayisi++;
            }
        }

        int ortalama = toplamNot / 5;
        System.out.println("Not ortalamanız: " + ortalama);
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        if (dusukNotSayisi > 0) {
            System.out.println("Düşük not aldığınız dersler var!");
        }

        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Kaldınız.");
        }

        scanner.close();
    }
}
