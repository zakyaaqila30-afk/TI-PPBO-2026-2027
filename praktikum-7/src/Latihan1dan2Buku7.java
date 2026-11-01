public class Latihan1dan2Buku7 {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Latihan1dan2Buku7(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter untuk semua atribut
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter hanya untuk judul dan pengarang (tahunTerbit read-only)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}