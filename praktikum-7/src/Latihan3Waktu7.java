public class Latihan3Waktu7 {
    private int jam;
    private int menit;
    private int detik;

    public Latihan3Waktu7(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }
    public int getJam() {
        return jam;
    }
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Jam tidak valid! Harus 0 - 23.");
        }
    }
    public int getMenit() {
        return menit;
    }
    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Menit tidak valid! Harus 0 - 59.");
        }
    }
    public int getDetik() {
        return detik;
    }
    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Detik tidak valid! Harus 0 - 59.");
        }
    }
}