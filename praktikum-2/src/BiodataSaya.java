import java.util.Scanner;

public class BiodataSaya {
    public static void main(String[] args){

        // Latihan Nomor 1
        // Menampilkan biodata dengan printl()
        System.out.println("Nama: Zakya Aqila");
        System.out.println("Nim : 2025573010134");
        System.out.println("Prodi : Teknik Informatika");

        // Latihan Nomor 2
        //  Menampilkan Nama dan NIM dalam satu baris
        System.out.print("Nama: Zakya Aqila- ");
        System.out.println("NIM : 2025573010134- ");
        System.out.println("Prodi: Teknik Informatika");


        // Latihan Nomor 3
        // Menggunakan beberapa tipe data
        String nama = "Zakya Aqila";
        int umur = 19;
        double tinggi = 150;
        char golDarah = '-';
        boolean mahasiswaAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + golDarah);
        System.out.println("Aktif: " + mahasiswaAktif);

        //latihan Nomor 4
        // Mengubah suhu Celsius ke Fahrenheit
        System.out.println("\n\nLatihan Nomor 4\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam derajat Celsius : ");
        double celsius = input.nextDouble();

        // Rumus konversi suhu
        double fahrenheit = celsius * 9 / 5 + 23;

        System.out.println("Hasil konversi : " + fahrenheit +  " °F");

        // Latihan  Nomor 5
        // Menggunakan input yang sudah dibuat pada Latihan 4
        // Tidak perlu membuat Scanner baru
        System.out.print("Masukkan bilangan bulat pertama = ");
        int a = input.nextInt();

        System.out.print("Masukkan bilang bulat kedua = ");
        int b = input.nextInt();

        // Menampilkan hasil operasi aritmatika
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Penjumlahan (" + a  + " + " + b +  ") = " + (a + b));
        System.out.println("Pengurangan (" + a  + " - " + b +  ") = " + (a - b));
        System.out.println("Perkalian (" + a  + " * " + b +  ") = " + (a * b));
        System.out.println("Pembagian (" + a  + " / " + b +  ") = " + ((double) a / b));
        System.out.println("Sisa bagi (" + a  + " % " + b +  ") = " + (a % b));

        // Menampilkan hasil perbandingan
        System.out.println("\n--- Hasil Perbandingan ---");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " = " + (a == b));

        input.close();
    }

}