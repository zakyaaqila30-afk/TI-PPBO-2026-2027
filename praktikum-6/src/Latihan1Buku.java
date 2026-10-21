public class Latihan1Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan 'this'
    public Latihan1Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData() {
        System.out.println("Judul        : " + this.judul);
        System.out.println("Pengarang    : " + this.pengarang);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        // Membuat 2 object berbeda di method main
        Latihan1Buku buku1 = new Latihan1Buku("Belajar Java", "Khaira Mislianti", 2018);
        Latihan1Buku buku2 = new Latihan1Buku("Pemrograman Berorientasi Objek", "Salwa Zulfiani", 2012);

        // Menampilkan datanya
        System.out.println(" DATA BUKU ");
        buku1.tampilkanData();
        buku2.tampilkanData();
    }
}