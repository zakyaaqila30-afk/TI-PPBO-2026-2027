public class MainProduk7 {
    public static void main(String[] args) {
        Latihan5Produk7 produk = new Latihan5Produk7("P001", "Buku PBO", 50000.0, 10);

        System.out.println("Kode Produk : " + produk.getKodeProduk());
        System.out.println("Nama Produk : " + produk.getNamaProduk());
        System.out.println("Harga       : " + produk.getHarga());
        System.out.println("Stok Awal   : " + produk.getStok());

        produk.tambahStok(5);
        produk.kurangiStok(3);

        produk.setHarga(-1000);
        produk.kurangiStok(20);

        System.out.println("Stok Akhir  : " + produk.getStok());
    }
}