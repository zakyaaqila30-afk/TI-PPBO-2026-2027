public class Latihan5Produk7 {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Latihan5Produk7(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak boleh negatif, diatur ke 0.");
        }
    }

    // Getter untuk semua atribut
    public String getKodeProduk() {
        return kodeProduk;
    }
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    // Setter dengan validasi
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok sekarang: " + stok);
        } else {
            System.out.println("Jumlah penambahan stok harus positif!");
        }
    }
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan stok harus positif!");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi untuk dikurangi!");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Stok sekarang: " + stok);
        }
    }
}