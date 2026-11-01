public class Latihan3Produk {
    String namaProduk;
    double harga;

    public Latihan3Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method isMahal yang mengembalikan boolean
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }

    public static void main(String[] args) {
        Latihan3Produk laptop = new Latihan3Produk("Laptop Gaming", 15000000);
        Latihan3Produk tetikus = new Latihan3Produk("Mouse Wireless", 150000);

        double batas = 500000;

        System.out.println(" CEK HARGA PRODUK ");
        // Menggunakan %.0f agar angka double dicetak tanpa koma/desimal dan tanpa notasi ilmiah
        System.out.printf("Batas Harga : Rp %.0f\n", batas);
        System.out.printf("%s (Rp %.0f) apakah mahal? %b\n", laptop.namaProduk, laptop.harga, laptop.isMahal(batas));
        System.out.printf("%s (Rp %.0f) apakah mahal? %b\n", tetikus.namaProduk, tetikus.harga, tetikus.isMahal(batas));
    }
}