public class TugasBankDemo7 {
    public static void main(String[] args) {
        // Membuat 2 object TugasRekeningBank dengan jenis rekening (read-only)
        TugasRekeningBank7 akun1 = new TugasRekeningBank7("R001", "Budi", "Tabungan", 500000);
        TugasRekeningBank7 akun2 = new TugasRekeningBank7("R002", "Siti", "Giro", 200000);

        System.out.println("--- STATUS AWAL REKENING ---");
        akun1.cetakMutasi();
        akun2.cetakMutasi();

        System.out.println("--- PENGUJIAN TRANSAKSI SETOR & TARIK ---");
        akun1.setor(150000); // Setor normal
        akun2.tarik(50000);  // Tarik normal

        System.out.println("\n--- PENGUJIAN SKENARIO TRANSFER ---");
        // 1. Transfer Berhasil
        akun1.transferKe(akun2, 100000);

        // 2. Transfer Gagal (Jumlah negatif / tidak valid)
        akun1.transferKe(akun2, -50000);

        // 3. Transfer Gagal (Saldo tidak cukup)
        akun2.transferKe(akun1, 1000000);

        System.out.println("\n--- CETAK MUTASI AKHIR KEDUA REKENING ---");
        akun1.cetakMutasi();
        akun2.cetakMutasi();
    }
}