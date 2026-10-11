import java.util.Arrays;
import java.util.Scanner;

public class Latihan {
    // No 1
    public static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }
    public static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }
    // No 2
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // No 3
    public static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit") || skalaTujuan.equalsIgnoreCase("F")) {
            return konversiSuhu(celsius);
        } else {
            System.out.println("Skala tidak dikenal. Menampilkan nilai awal:");
            return celsius;
        }
    }

    // No 4
    public static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    public static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // No 5
    public static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    public static int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) {
            return new int[0];
        }
        double rataRata = (double) hitungTotal(data) / data.length;

        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }
        int[] hasil = new int[count];
        int index = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No 1
        System.out.println("Luas Persegi Panjang (10 x 5) : " + luasPersegiPanjang(10, 5));
        System.out.println("Luas Persegi Panjang (7.5 x 3.2) : " + luasPersegiPanjang(7.5, 3.2));
        System.out.println("Luas Lingkaran (r = 7)         : " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r = 10)        : " + luasLingkaran(10));
        System.out.println();

        // No 2
        System.out.println("Bilangan prima dari 1 sampai 50:");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // No 3
        double celsius = 25.0;
        System.out.println(celsius + " C ke Fahrenheit (1 param) : " + konversiSuhu(celsius) + " F");
        System.out.println(celsius + " C ke Fahrenheit (2 param) : " + konversiSuhu(celsius, "Fahrenheit") + " F");
        System.out.println(celsius + " C ke Kelvin (2 param)     : " + konversiSuhu(celsius, "Kelvin") + " K");
        System.out.println();

        // No 4
        System.out.print("Masukkan jumlah nilai ujian: ");
        int n = scanner.nextInt();
        int[] nilaiUjian = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextInt();
        }

        System.out.println("Nilai Minimum  : " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum : " + cariNilaiMaksimum(nilaiUjian));
        System.out.println();

        // No 5
        int total = hitungTotal(nilaiUjian);
        double rataRata = (double) total / nilaiUjian.length;
        int[] diatasRata = filterDiAtasRataRata(nilaiUjian);

        System.out.println("Data Nilai        : " + Arrays.toString(nilaiUjian));
        System.out.println("Total Nilai       : " + total);
        System.out.printf("Rata-rata         : %.2f\n", rataRata);
        System.out.println("Di atas rata-rata : " + Arrays.toString(diatasRata));

        scanner.close();
    }
}