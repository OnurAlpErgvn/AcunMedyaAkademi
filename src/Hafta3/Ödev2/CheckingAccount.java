package Hafta3.Ödev2;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double bakiye) {
        super(bakiye);
    }

    @Override
    public void faizHesapla() {
        System.out.println("Vadesiz hesaplar faiz kazandırmaz.");
    }
}
