public class KebunBinatangDemo {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
                new Kucing("Milo"),
                new Anjing("Rex"),
                new Kucing("Oyen"),
                new Bebek( "heli")
        };

        for (Hewan h : daftarHewan) {
            h.bersuara(); // versi method sesuai object aslinya
        }
    }
}