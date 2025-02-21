package Hafta1;

import java.util.Scanner;

public class Market_Kasa_Programı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elmaFiyat = 12;
        int yumurtaFiyat = 22;
        int makarnaFiyat = 18;
        int toplamTutar = 0;
        int secim;

        System.out.println("Marketimize Hoş Geldiniz!");
        System.out.println("1. Elma - 12 TL");
        System.out.println("2. Yumurta - 22 TL");
        System.out.println("3. Makarna - 18 TL");
        System.out.println("0. Alışverişi Tamamla");

        do {
            System.out.print("Ürün seçiniz (0 ile çıkış): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamTutar += elmaFiyat;
                    System.out.println("Elma sepete eklendi.");
                    break;
                case 2:
                    toplamTutar += yumurtaFiyat;
                    System.out.println("Yumurta sepete eklendi.");
                    break;
                case 3:
                    toplamTutar += makarnaFiyat;
                    System.out.println("Makarna sepete eklendi.");
                    break;
                case 0:
                    System.out.println("Alışveriş tamamlandı.");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyiniz.");
            }
        } while (secim != 0);

        System.out.print("İndirim kuponunuz var mı? (EVET/HAYIR): ");
        String kupon = scanner.next();

        if (kupon.equalsIgnoreCase("EVET")) {
            toplamTutar -= toplamTutar / 10; // %10 indirim
            System.out.println("İndirim uygulandı.");
        }

        System.out.println("Toplam ödemeniz: " + toplamTutar + " TL");
        System.out.println("Teşekkür ederiz!");

        scanner.close();
    }
}
