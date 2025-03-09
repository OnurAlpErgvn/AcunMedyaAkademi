package Hafta3.Ödev1;

public class AnaProgram {
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici(1, "Ahmet", 5000, "IT", 10);
        Gelistirici gelistirici = new Gelistirici(2, "Mehmet", 4000, "Yazilim", "Java Gelistirici");

        System.out.println("Yönetici Primi: " + yonetici.hesaplaPrim());
        System.out.println("Geliştirici Primi: " + gelistirici.hesaplaPrim());
    }
}
