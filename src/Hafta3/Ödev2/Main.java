package Hafta3.Ödev2;

public class Main {
    public static void main(String[] args) {
        BankAccount vadeliHesap = new SavingsAccount(1000);
        BankAccount vadesizHesap = new CheckingAccount(1500);

        vadeliHesap.faizHesapla();
        vadesizHesap.faizHesapla();
    }
}
