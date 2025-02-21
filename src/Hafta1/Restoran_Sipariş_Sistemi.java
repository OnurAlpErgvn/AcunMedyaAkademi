package Hafta1;

import java.util.Scanner;

public class Restoran_Sipariş_Sistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pizzaFiyat = 50;
        int burgerFiyat = 40;
        int salataFiyat = 30;
        int toplamTutar = 0;
        int secim;

        System.out.println("Restoran Sipariş Sistemine Hoş Geldiniz!");
        System.out.println("1. Pizza - 50 TL");
        System.out.println("2. Burger - 40 TL");
        System.out.println("3. Salata - 30 TL");
        System.out.println("0. Siparişi Tamamla");

        do {
            System.out.print("Lütfen bir yemek seçiniz (0 ile çıkış): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamTutar += pizzaFiyat;
                    System.out.println("Pizza eklendi.");
                    break;
                case 2:
                    toplamTutar += burgerFiyat;
                    System.out.println("Burger eklendi.");
                    break;
                case 3:
                    toplamTutar += salataFiyat;
                    System.out.println("Salata eklendi.");
                    break;
                case 0:
                    System.out.println("Sipariş tamamlandı.");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyiniz.");
            }
        } while (secim != 0);

        System.out.println("Toplam ödemeniz: " + toplamTutar + " TL");
        System.out.println("Afiyet olsun!");

        scanner.close();
    }
}
