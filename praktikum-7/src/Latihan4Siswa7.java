public class Latihan4Siswa7 {
    private double nilai;

    public Latihan4Siswa7(double nilai) {
        setNilai(nilai);
    }
    public double getNilai() {
        return nilai;
    }
    public void setNilai(double nilai) {
        if (nilai >= 0.0 && nilai <= 100.0) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid! Harus antara 0 - 100.");
        }
    }
    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 75) {
            return 'B';
        } else if (nilai >= 65) {
            return 'C';
        } else if (nilai >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}