package Hafta1;

import java.util.Scanner;

public class Trafik_Cezası_Hesaplayıcı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hizSiniri = 90;
        int ceza = 0;

        System.out.print("Hızınızı giriniz (km/s): ");
        int hiz = scanner.nextInt();

        if (hiz > hizSiniri) {
            if (hiz <= 110) {
                ceza = 1000;
            } else if (hiz <= 130) {
                ceza = 2000;
            } else {
                System.out.println("Hızınız çok yüksek! Ehliyetinize el konuldu.");
                return;
            }
            System.out.println("Hız sınırını aştınız! Ceza: " + ceza + " TL");
        }
        scanner.close();
    }
}
