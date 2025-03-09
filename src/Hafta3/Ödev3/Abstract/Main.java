package Hafta3.Ödev3.Abstract;

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new ElektrikliAraba();
        Araba araba2 = new BenzinliAraba();

        araba1.hizlan();
        araba2.hizlan();
    }
}
