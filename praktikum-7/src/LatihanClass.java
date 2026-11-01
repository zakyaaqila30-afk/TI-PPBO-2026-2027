
public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2025573010134", "Zakya Aqila", 3.8);
        System.out.println("IPK sekarang: " + m1.getIpk());
        m1.setIpk(9.9);
        System.out.println("IPK sekarang: " + m1.getIpk());
    }
}
