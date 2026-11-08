public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Kinerja: Rp " + tunjanganKinerja);
    }
}