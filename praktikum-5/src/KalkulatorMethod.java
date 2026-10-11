import java.util.Arrays;
import java.util.Scanner;

public class KalkulatorMethod {

    // a) method static buat tiap operasi aritmatika
    // c) overloading method tambah (bisa 2 angka atau 3 angka)
    public static double tambah(double a, double b) {
        return a + b;
    }
    public static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    public static double kurang(double a, double b) {
        return a - b;
    }
    public static double kali(double a, double b) {
        return a * b;
    }
    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: gak bisa bagi sama nol!");
            return Double.NaN;
        }
        return a / b;
    }
    public static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
    public static double akarKuadrat(double a) {
        if (a < 0) {
            System.out.println("Error: angka minus gak ada akarnya!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
    // d) cari nilai hasil paling gede dari array riwayat
    public static double riwayatKeMaksimum(double[] riwayatHasil) {
        if (riwayatHasil == null || riwayatHasil.length == 0) {
            return Double.NaN;
        }
        double max = riwayatHasil[0];
        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }
    // b) menu pilihan pake scanner & perulangan di main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] riwayatHasil = new double[0];
        boolean berjalan = true;

        while (berjalan) {
            System.out.println(" KALKULATOR METHOD ");
            System.out.println("1. Tambah (2 Angka)");
            System.out.println("2. Tambah (3 Angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");
            int pilihan = scanner.nextInt();
            double hasil = Double.NaN;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double t1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double t2 = scanner.nextDouble();
                    hasil = tambah(t1, t2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double t3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double t4 = scanner.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double t5 = scanner.nextDouble();
                    hasil = tambah(t3, t4, t5);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double k1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double k2 = scanner.nextDouble();
                    hasil = kurang(k1, k2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double kl1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double kl2 = scanner.nextDouble();
                    hasil = kali(kl1, kl2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    double bg1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double bg2 = scanner.nextDouble();
                    hasil = bagi(bg1, bg2);
                    if (!Double.isNaN(hasil)) {
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 6:
                    System.out.print("Masukkan angka basis: ");
                    double p1 = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double p2 = scanner.nextDouble();
                    hasil = pangkat(p1, p2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    double ak1 = scanner.nextDouble();
                    hasil = akarKuadrat(ak1);
                    if (!Double.isNaN(hasil)) {
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 8:
                    berjalan = false;
                    System.out.println("\nProgram Selesai.");
                    // d) cetak nilai max pas user keluar
                    if (riwayatHasil.length > 0) {
                        double nilaiMaks = riwayatKeMaksimum(riwayatHasil);
                        System.out.println("Nilai hasil perhitungan terbesar yang pernah dihitung: " + nilaiMaks);
                    } else {
                        System.out.println("Belum ada perhitungan yang dilakukan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            // d) simpan tiap hasil hitungan ke array riwayat
            if (!Double.isNaN(hasil) && pilihan >= 1 && pilihan <= 7) {
                riwayatHasil = Arrays.copyOf(riwayatHasil, riwayatHasil.length + 1);
                riwayatHasil[riwayatHasil.length - 1] = hasil;
            }

            System.out.println();
        }

        scanner.close();
    }
}