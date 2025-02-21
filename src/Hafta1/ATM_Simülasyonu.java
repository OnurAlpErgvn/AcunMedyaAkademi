package Hafta1;

import java.util.Scanner;

public class ATM_Simülasyonu {
    public static void main(String[] args) {
        double bakiye = 1000.0;
        String dogruSifre = "1903";
        Scanner scanner = new Scanner(System.in);

        String girilenSifre;
        while (true) {
            System.out.print("Lütfen şifrenizi girin: ");
            girilenSifre = scanner.nextLine();

            if (girilenSifre.equals(dogruSifre)) {
                break;
            } else {
                System.out.println("Şifre yanlış! Lütfen doğru şifreyi giriniz.");
            }
        }

        while (true) {
            System.out.println("\n1. Bakiye Görüntüleme\n2. Para Yatırma\n3. Para Çekme\n4. Çıkış");
            System.out.print("Bir işlem seçin: ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("Mevcut Bakiye: " + bakiye + " TL");
            } else if (secim == 2) {
                System.out.print("Yatırmak istediğiniz tutar: ");
                double yatirilanMiktar = scanner.nextDouble();
                bakiye += yatirilanMiktar;
                System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
            } else if (secim == 3) {
                System.out.print("Çekmek istediğiniz tutar: ");
                double cekilenMiktar = scanner.nextDouble();
                if (cekilenMiktar > bakiye) {
                    System.out.println("Yetersiz bakiye!");
                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println(cekilenMiktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
                }
            } else if (secim == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
