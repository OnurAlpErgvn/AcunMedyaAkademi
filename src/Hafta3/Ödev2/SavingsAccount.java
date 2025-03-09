package Hafta3.Ödev2;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double bakiye) {
        super(bakiye);
    }

    @Override
    public void faizHesapla() {
        double faiz = bakiye * 0.05; // %5 faiz
        System.out.println("Vadeli Hesap faizi: " + faiz);
    }
}
