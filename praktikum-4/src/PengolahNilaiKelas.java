import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KKM = 70.0;

        // a) Membaca jumlah mahasiswa N
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = scanner.nextInt();

        double[] nilai = new double[N];

        System.out.println("\nMasukkan nilai ujian masing-masing mahasiswa:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
        }

        double[] nilaiSorted = new double[N];
        for (int i = 0; i < N; i++) {
            nilaiSorted[i] = nilai[i];
        }

        // b) Perhitungan statistik
        double total = 0;
        double tertinggi = nilai[0];
        double terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {
            total += nilai[i];

            // Cek nilai tertinggi
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            // Cek nilai terendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = total / N;

        // c) Mengurutkan array nilai secara ascending menggunakan Bubble Sort manual
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (nilaiSorted[j] > nilaiSorted[j + 1]) {
                    // Proses tukar posisi (swap)
                    double temp = nilaiSorted[j];
                    nilaiSorted[j] = nilaiSorted[j + 1];
                    nilaiSorted[j + 1] = temp;
                }
            }
        }

        // d) Menampilkan seluruh hasil dalam format laporan yang rapi
        System.out.println("\nLAPORAN HASIL NILAI KELAS");
        System.out.println("Jumlah Mahasiswa (N)    : " + N);
        System.out.println("Batas KKM               : " + KKM);
        System.out.println("Nilai Rata-Rata Kelas   : " + String.format("%.2f", rataRata));
        System.out.println("Nilai Tertinggi         : " + tertinggi);
        System.out.println("Nilai Terendah          : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus  : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus      : " + jumlahTidakLulus);

        System.out.print("Nilai Sebelum Diurutkan : [ ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + (i < N - 1 ? ", " : ""));
        }
        System.out.println(" ]");

        System.out.print("Nilai Sesudah Diurutkan : [ ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilaiSorted[i] + (i < N - 1 ? ", " : ""));
        }
        System.out.println(" ]");

        scanner.close();
    }
}