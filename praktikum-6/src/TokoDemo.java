public class TokoDemo {
    public static void main(String[] args) {

        Produk[] daftarProduk = new Produk[5];
        daftarProduk[0] = new Produk("P001", "Laptop", 8500000.0, 5);
        daftarProduk[1] = new Produk("P002", "Mouse", 150000.0, 10);
        daftarProduk[2] = new Produk("P003", "Keyboard", 350000.0, 3);
        daftarProduk[3] = new Produk("P004", "Monitor", 2200000.0, 4);
        daftarProduk[4] = new Produk("P005", "Headset", 450000.0, 2);

        System.out.println(" DAFTAR PRODUK TOKO ");
        for (Produk p : daftarProduk) {
            p.tampilkanData();
        }
        System.out.println();

        System.out.println(" SIMULASI PEMBELIAN ");

        int jumlahBeli1 = 2;
        System.out.println("Membeli " + jumlahBeli1 + " unit " + daftarProduk[1].namaProduk + "...");
        System.out.println("Total Harga: Rp " + daftarProduk[1].hitungTotalHarga(jumlahBeli1));
        daftarProduk[1].kurangiStok(jumlahBeli1);
        System.out.println();

        int jumlahBeli2 = 5;
        System.out.println("Membeli " + jumlahBeli2 + " unit " + daftarProduk[4].namaProduk + "...");
        System.out.println("Total Harga: Rp " + daftarProduk[4].hitungTotalHarga(jumlahBeli2));
        daftarProduk[4].kurangiStok(jumlahBeli2);
        System.out.println();

        System.out.println(" PRODUK TERMAHAL ");
        Produk produkTermahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }

        System.out.println("Produk dengan harga termahal adalah:");
        produkTermahal.tampilkanData();
    }
}