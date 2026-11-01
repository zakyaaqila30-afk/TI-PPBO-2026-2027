public class MainWaktu7 {
    public static void main(String[] args) {
        // 1. Menguji pembuatan objek dengan nilai valid
        System.out.println("=== PENGUJIAN WAKTU VALID ===");
        Latihan3Waktu7 waktu1 = new Latihan3Waktu7(14, 30, 45);
        System.out.println("Jam   : " + waktu1.getJam());
        System.out.println("Menit : " + waktu1.getMenit());
        System.out.println("Detik : " + waktu1.getDetik());

        System.out.println();

        // 2. Menguji setter dengan nilai TIDAK VALID (di luar rentang wajar)
        System.out.println("=== PENGUJIAN VALIDASI SETTER (NILAI SALAH) ===");
        waktu1.setJam(25);   // Seharusnya ditolak (harus 0-23)
        waktu1.setMenit(65); // Seharusnya ditolak (harus 0-59)
        waktu1.setDetik(-5); // Seharusnya ditolak (harus 0-59)

        // 3. Menampilkan nilai akhir (pastikan nilai lama tidak berubah karena ditolak)
        System.out.println("\n=== NILAI AKHIR SETELAH DITOLAK ===");
        System.out.println("Jam   : " + waktu1.getJam());
        System.out.println("Menit : " + waktu1.getMenit());
        System.out.println("Detik : " + waktu1.getDetik());
    }
}