public class Latihan2Persegi {
    double sisi;

    // Constructor berparameter
    public Latihan2Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Instance method hitungLuas()
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Instance method hitungKeliling()
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public void tampilkanInfo() {
        System.out.println("Persegi dengan sisi : " + sisi);
        System.out.println("Luas                : " + hitungLuas());
        System.out.println("Keliling            : " + hitungKeliling());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        // Membuat beberapa object dengan ukuran sisi berbeda
        Latihan2Persegi persegi1 = new Latihan2Persegi(5.0);
        Latihan2Persegi persegi2 = new Latihan2Persegi(8.5);
        Latihan2Persegi persegi3 = new Latihan2Persegi(12.0);

        // Menampilkan hasil perhitungannya
        System.out.println(" HASIL PERHITUNGAN PERSEGI ");
        persegi1.tampilkanInfo();
        persegi2.tampilkanInfo();
        persegi3.tampilkanInfo();
    }
}