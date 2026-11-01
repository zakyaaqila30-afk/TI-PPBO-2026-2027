public class Latihan4ArrayBuku {
    public static void main(String[] args) {
        Latihan1Buku[] daftarBuku = new Latihan1Buku[5];

        daftarBuku[0] = new Latihan1Buku("Aku Memang Yang Bersalah", "Ulva", 2012);
        daftarBuku[1] = new Latihan1Buku("Cinta", "Nisa", 2018);
        daftarBuku[2] = new Latihan1Buku("Basis Data Lanjut", "Maira", 2014);
        daftarBuku[3] = new Latihan1Buku("Pemrograman Web", "Gita", 2021);
        daftarBuku[4] = new Latihan1Buku("Kecerdasan Buatan", "Lulu", 2020);

        System.out.println(" BUKU YANG TERBIT SETELAH TAHUN 2015 ");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
            }
        }    }
}