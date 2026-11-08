class Akun {
    protected String username;
    protected double saldo;

    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
    }
}
class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }
    public void cekLimit() {
        // Mengakses saldo (protected dari superclass) dan batasKredit (milik sendiri)
        System.out.println("Username     : " + username);
        System.out.println("Saldo        : " + saldo);
        System.out.println("Batas Kredit : " + batasKredit);
    }
}
public class Latihan5Akun {
    public static void main(String[] args) {
        AkunPremium akun = new AkunPremium("zakya", 5000000.0, 2500000.0);
        akun.cekLimit();
    }
}