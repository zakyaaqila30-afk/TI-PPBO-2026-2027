import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Latihan 1 Menentukan Ganjil / Genap

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah Genap");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah Ganjil");
        }

        // Latihan 2 Bilangan Terbesar

        System.out.print("\n\nMasukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        int terbesar;

        if (a > b) {
            if (a > c) {
                terbesar = a;
            } else {
                terbesar = c;
            }
        } else {
            if (b > c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);

        // Latihan 3 Menu Makanan

        System.out.println("\n\n1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Ayam Geprek");
        System.out.println("4. Nasi Padang");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih Ayam Geprek");
                break;
            case 4:
                System.out.println("Anda memilih Nasi Padang");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }

        // Latihan 4 Status Mahasiswa

        System.out.print("\n\nMasukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        if (mahasiswa && umur < 25) {
            System.out.println("Status: Mahasiswa");
            System.out.println("Mendapat harga tiket khusus");
        } else {
            System.out.println("Status: Bukan mahasiswa atau tidak memenuhi syarat");
            System.out.println("Tidak mendapat harga tiket khusus");
        }

        // Latihan 5 Klasifikasi BMI

        System.out.print("\n\nMasukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        double tinggiMeter = tinggiCm / 100.0;

        double bmi = berat / (tinggiMeter * tinggiMeter);

        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        input.close();
    }
}