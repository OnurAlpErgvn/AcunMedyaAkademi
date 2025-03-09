package Hafta3.Ödev3.Abstract2;

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new OtomatikAraba();
        Araba araba2 = new ManuelAraba();

        araba1.vitesDegistir();
        araba2.vitesDegistir();
    }
}
