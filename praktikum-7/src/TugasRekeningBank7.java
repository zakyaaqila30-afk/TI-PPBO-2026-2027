public class TugasRekeningBank7 {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening; // Atribut read-only (tanpa setter)
    private double saldo;

    // Constructor
    public TugasRekeningBank7(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Setor
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil ke rekening " + nomorRekening + ". Saldo: " + saldo);
    }

    // Method Tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan di rekening " + nomorRekening);
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil dari rekening " + nomorRekening + ". Saldo: " + saldo);
        }
    }
    // Method transferKe dengan validasi
    public void transferKe(TugasRekeningBank7 tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: Jumlah transfer harus bernilai positif (> 0).");
        } else if (jumlah > saldo) {
            System.out.println("Transfer GAGAL: Saldo pengirim (" + saldo + ") tidak mencukupi untuk transfer sebesar " + jumlah + ".");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL sebesar " + jumlah + " dari " + this.pemilik + " ke " + tujuan.pemilik);
        }
    }

    // Method cetakMutasi() format laporan rapi
    public void cetakMutasi() {
        System.out.println("==========LAPORAN MUTASI REKENING==========");
        System.out.println("Nomor Rekening  : " + nomorRekening);
        System.out.println("Nama Pemilik    : " + pemilik);
        System.out.println("Jenis Rekening  : " + jenisRekening);
        System.out.println("Saldo Saat Ini  : Rp " + saldo);
        System.out.println("========================================\n");
    }
}