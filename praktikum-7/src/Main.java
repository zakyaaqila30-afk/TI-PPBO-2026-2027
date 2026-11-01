
abstract class Pembayaran {
    // Encapsulation
    private double nominal;

    public Pembayaran(double nominal) {
        this.nominal = nominal;
    }
    public double getNominal() {
        return nominal;
    }
    public abstract void prosesPembayaran();
}
// Inheritance
class Tunai extends Pembayaran {
    public Tunai(double nominal) {
        super(nominal);
    }
    // Runtime polymorphism
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran tunai: Rp" + getNominal());
    }
}
class Transfer extends Pembayaran {
    public Transfer(double nominal) {
        super(nominal);
    }
    // Runtime polymorphism
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran transfer: Rp" + getNominal());
    }
}
public class Main {
    // Compile-time polymorphism
    static void tampilkan(String nama) {
        System.out.println("Nama: " + nama);
    }
    static void tampilkan(String nama, double nominal) {
        System.out.println("Nama: " + nama + ", Nominal: Rp" + nominal);
    }
    public static void main(String[] args) {
        Pembayaran p1 = new Tunai(50000);
        Pembayaran p2 = new Transfer(100000);

        tampilkan("Andi");
        tampilkan("Budi", 100000);

        p1.prosesPembayaran();
        p2.prosesPembayaran();
    }
}
