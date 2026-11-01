public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.setIpk(ipk);
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= (double)0.0F && ipk <= (double)4.0F) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus 0.0 - 4.0");
        }

    }

    public boolean isCumlaude() {
        return this.ipk >= (double)3.5F;
    }

    public void tampilkanData() {
        System.out.println("NIM  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("IPK  : " + this.ipk);
    }
}
