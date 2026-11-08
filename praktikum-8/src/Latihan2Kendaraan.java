class KendaraanLatihan2 {
    protected String merek;
    protected int kecepatanMaks;
}
class MobilLatihan2 extends KendaraanLatihan2 {
    int jumlahPintu;
}
class MotorLatihan2 extends KendaraanLatihan2 {
    String jenisMotor;
}
public class Latihan2Kendaraan {
    public static void main(String[] args) {
        MobilLatihan2 mobilku = new MobilLatihan2();
        mobilku.merek = "Toyota";
        mobilku.kecepatanMaks = 180;
        mobilku.jumlahPintu = 4;

        System.out.println("Merek Mobil: " + mobilku.merek);
    }
}