public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7.0),
                new Persegi("Persegi B", 5.0),
                new PersegiPanjang("Persegi Panjang C", 8.0, 4.0),
                new Lingkaran("Lingkaran D", 14.0),
                new Persegi("Persegi E", 10.0)
        };
        double totalLuas = 0;
        BangunDatar terbesar = daftarBangun[0];

        for (BangunDatar bd : daftarBangun) {
            bd.tampilkanInfo();
            double luas = bd.hitungLuas();
            totalLuas += luas;

            if (luas > terbesar.hitungLuas()) {
                terbesar = bd;
            }
        }
        System.out.println("Total Luas Keseluruhan: " + totalLuas);
        System.out.println("Bangun dengan Luas Terbesar: " + terbesar.namaBangun + " dengan luas " + terbesar.hitungLuas());
    }
}