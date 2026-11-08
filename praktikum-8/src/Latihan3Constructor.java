class KendaraanLatihan3 {
    protected String merek;
    protected int kecepatanMaks;

    public KendaraanLatihan3(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}
class MobilLatihan3 extends KendaraanLatihan3 {
    int jumlahPintu;

    public MobilLatihan3(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks); // Constructor chaining
        this.jumlahPintu = jumlahPintu;
    }
}
class MotorLatihan3 extends KendaraanLatihan3 {
    String jenisMotor;

    public MotorLatihan3(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks); // Constructor chaining
        this.jenisMotor = jenisMotor;
    }
}
public class Latihan3Constructor {
    public static void main(String[] args) {
        MobilLatihan3 mobilBaru = new MobilLatihan3("Honda", 200, 4);
        MotorLatihan3 motorBaru = new MotorLatihan3("Yamaha", 130, "Matic");

        System.out.println("Mobil: " + mobilBaru.merek + ", Pintu: " + mobilBaru.jumlahPintu);
        System.out.println("Motor: " + motorBaru.merek + ", Jenis: " + motorBaru.jenisMotor);
    }
}