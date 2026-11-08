class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;
    public Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}
class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }
    public void tampilkanInfo() {
        // Mengakses LANGSUNG atribut merek dan kecepatanMaks tanpa getter
        System.out.println("Merek Kendaraan : " + merek);
        System.out.println("Kecepatan Maks  : " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
    }
}
public class Latihan4Protected {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("Suzuki", 160, 4);
        mbl.tampilkanInfo();
    }
}