public class Manager extends Pegawai {
    protected double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}