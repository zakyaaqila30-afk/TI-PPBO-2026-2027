public class MainBuku7 {
    public static void main(String[] args) {
        Latihan1dan2Buku7 buku = new Latihan1dan2Buku7("Pemrograman Berorientasi Objek", "Zakya Aqila", 2026);

        // 2. Menampilkan data awal menggunakan Getter
        System.out.println("=== DATA BUKU AWAL ===");
        System.out.println("Judul        : " + buku.getJudul());
        System.out.println("Pengarang    : " + buku.getPengarang());
        System.out.println("Tahun Terbit : " + buku.getTahunTerbit());

        System.out.println();

        buku.setJudul("Pemrograman Java Lanjutan");
        buku.setPengarang("Zakya Aqila S.");

        System.out.println("=== DATA BUKU SETELAH DI-UPDATE ===");
        System.out.println("Judul Baru     : " + buku.getJudul());
        System.out.println("Pengarang Baru : " + buku.getPengarang());
        System.out.println("Tahun Terbit   : " + buku.getTahunTerbit() + " (Tetap/Read-Only)");
    }
}