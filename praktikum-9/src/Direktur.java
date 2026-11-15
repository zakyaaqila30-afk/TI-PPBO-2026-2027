public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    @Override
    public double hitungGaji() {
        // Memanggil hitungGaji milik Manager (gajiPokok + tunjanganJabatan) lalu ditambah tunjanganSaham
        return super.hitungGaji() + tunjanganSaham;
    }
}