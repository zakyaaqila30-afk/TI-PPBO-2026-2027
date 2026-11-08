public class Direktur extends Manager {
    private double tunjanganSaham;
    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Saham  : Rp " + tunjanganSaham);
    }
}