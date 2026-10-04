import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Latihan 1
        System.out.print("Masukkan sebuah angka: ");
        int angka1 = scanner.nextInt();

        System.out.println("Tabel perkalian " + angka1 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka1 + " x " + i + " = " + (angka1 * i));
        }


        // Latihan 2
        System.out.print("\nMasukkan ukuran/tinggi pola: ");
        int n2 = scanner.nextInt();

        System.out.println("\nPola Segitiga Terbalik:");
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPola Persegi:");
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // Latihan 3
        int[] numbers3 = new int[10];

        System.out.println("\nMasukkan 10 angka:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            numbers3[i] = scanner.nextInt();
        }

        System.out.println("Array dalam urutan terbalik:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();


        // Latihan 4
        int[][] matriks4 = new int[3][3];
        int totalSemua4 = 0;

        System.out.println("\nMasukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks4[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Hasil Perhitungan Matriks:");
        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks4[i][j];
                totalSemua4 += matriks4[i][j];
            }
            System.out.println("Jumlah elemen baris ke-" + (i + 1) + ": " + jumlahBaris);
        }
        System.out.println("Jumlah seluruh elemen matriks: " + totalSemua4);


        // Latihan 5
        System.out.print("\nMasukkan jumlah elemen array: ");
        int n5 = scanner.nextInt();

        if (n5 < 2) {
            System.out.println("Array harus memiliki minimal 2 elemen!");
        } else {
            int[] arr5 = new int[n5];
            System.out.println("Masukkan elemen array:");
            for (int i = 0; i < n5; i++) {
                System.out.print("Elemen ke-" + (i + 1) + ": ");
                arr5[i] = scanner.nextInt();
            }

            int terbesar = Integer.MIN_VALUE;
            int terbesarKedua = Integer.MIN_VALUE;

            for (int i = 0; i < n5; i++) {
                if (arr5[i] > terbesar) {
                    terbesarKedua = terbesar;
                    terbesar = arr5[i];
                } else if (arr5[i] > terbesarKedua && arr5[i] != terbesar) {
                    terbesarKedua = arr5[i];
                }
            }

            if (terbesarKedua == Integer.MIN_VALUE) {
                System.out.println("Tidak ada nilai terbesar kedua (semua elemen bernilai sama).");
            } else {
                System.out.println("Nilai TERBESAR KEDUA adalah: " + terbesarKedua);
            }
        }


        // Latihan 6
        System.out.print("\nMasukkan jumlah elemen array: ");
        int n6 = scanner.nextInt();

        int[] arr6 = new int[n6];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n6; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr6[i] = scanner.nextInt();
        }

        System.out.print("\nArray Sebelum Diurutkan: ");
        for (int val : arr6) {
            System.out.print(val + " ");
        }
        System.out.println();

        for (int i = 0; i < n6 - 1; i++) {
            for (int j = 0; j < n6 - i - 1; j++) {
                if (arr6[j] > arr6[j + 1]) {
                    int temp = arr6[j];
                    arr6[j] = arr6[j + 1];
                    arr6[j + 1] = temp;
                }
            }
        }

        System.out.print("Array Sesudah Diurutkan (Ascending): ");
        for (int val : arr6) {
            System.out.print(val + " ");
        }
        System.out.println();

        scanner.close();
    }
}