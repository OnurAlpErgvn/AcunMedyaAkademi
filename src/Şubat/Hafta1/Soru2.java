package Şubat.Hafta1;

public class Soru2 {
    public static void main(String[] args) {
        int[] dizi = {12, 45, 7, 89, 23};
        int enBuyuk = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        System.out.println("Dizideki en büyük sayı: " + enBuyuk);
    }
}
