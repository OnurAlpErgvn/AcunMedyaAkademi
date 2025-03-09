package Hafta3.Ödev1;

class Gelistirici extends Calisan {
    String hakkinda;

    public Gelistirici(int id, String isim, double maas, String departman, String hakkinda) {
        super(id, isim, maas, departman);
        this.hakkinda = hakkinda;
    }

    @Override
    public double hesaplaPrim() {
        return maas * 0.1;
    }
}