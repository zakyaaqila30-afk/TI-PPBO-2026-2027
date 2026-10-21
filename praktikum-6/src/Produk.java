public class Produk {
    // 1. Atribut
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // 2. Constructor dengan parameter menggunakan 'this'
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Method untuk menghitung total harga
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // 4. Method untuk mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil! Stok " + namaProduk + " berkurang " + jumlah + ". Stok sisa: " + stok);
        } else {
            System.out.println("Gagal membeli " + namaProduk + ": Stok tidak mencukupi!");
        }
    }

    // 5. Method untuk menampilkan data produk
    public void tampilkanData() {
        System.out.printf("Kode: %-6s | Nama: %-15s | Harga: Rp %-10.2f | Stok: %d\n",
                kodeProduk, namaProduk, harga, stok);
    }
}