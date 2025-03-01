package Hafta2;

import java.util.ArrayList;

public class Soru9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Porsche");
        list.add("Audi");
        list.add("Mercedes");

        System.out.println("Başlangıç Listesi: " + list);
        System.out.println("---------------------------------");

        // get
        System.out.println("2. eleman: " + list.get(1));

        // set
        list.set(1, "Lamborghini");
        System.out.println("set(1, \"Lamborghini\") sonrası: " + list);
        System.out.println("---------------------------------");

        // remove
        list.remove(2);
        System.out.println("remove(2) sonrası: " + list);
        System.out.println("---------------------------------");

        // size
        System.out.println("Listenin boyutu: " + list.size());
        System.out.println("---------------------------------");

        // clear
        list.clear();
        System.out.println("clear() sonrası liste: " + list);
    }
}
