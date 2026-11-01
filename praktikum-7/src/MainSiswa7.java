public class MainSiswa7 {
    public static void main(String[] args) {
        Latihan4Siswa7 siswa = new Latihan4Siswa7(85.0);

        System.out.println("Nilai Angka : " + siswa.getNilai());
        System.out.println("Nilai Huruf : " + siswa.getNilaiHuruf());

        siswa.setNilai(105.0);

        siswa.setNilai(78.5);
        System.out.println("Nilai Angka : " + siswa.getNilai());
        System.out.println("Nilai Huruf : " + siswa.getNilaiHuruf());
    }
}