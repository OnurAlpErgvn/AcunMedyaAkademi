package Hafta3.Ödev1;

class Yonetici extends Calisan {
    int takimBoyutu;

    public Yonetici(int id, String isim, double maas, String departman, int takimBoyutu) {
        super(id, isim, maas, departman);
        this.takimBoyutu = takimBoyutu;
    }

    @Override
    public double hesaplaPrim() {
        return maas * 0.2;
    }
}

