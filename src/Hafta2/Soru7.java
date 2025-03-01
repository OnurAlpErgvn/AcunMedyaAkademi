package Hafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("Bursa");
        cities.add("Antalya");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Şehir girin: ");
        String city = scanner.nextLine();

        int index = cities.indexOf(city);
        System.out.println(index >= 0 ? city + " listede var. İndeksi: " + index : city + " listede yok.");
    }
}
