public class Latihan5ArrayPersegi {
    public static void main(String[] args) {

        Latihan2Persegi[] daftarPersegi = {
                new Latihan2Persegi(4.0),
                new Latihan2Persegi(10.0),
                new Latihan2Persegi(7.5),
                new Latihan2Persegi(2.0)
        };
        Latihan2Persegi persegiTerbesar = daftarPersegi[0];

        // Looping cari luas paling besar
        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > persegiTerbesar.hitungLuas()) {
                persegiTerbesar = daftarPersegi[i];
            }
        }

        System.out.println(" PERSEGI DENGAN LUAS TERBESAR ");
        System.out.println("Ukuran Sisi : " + persegiTerbesar.sisi);
        System.out.println("Luas        : " + persegiTerbesar.hitungLuas());
    }
}