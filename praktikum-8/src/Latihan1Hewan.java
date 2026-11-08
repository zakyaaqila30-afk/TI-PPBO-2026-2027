class Hewan {
    protected String nama;

    public void bersuara() {
        System.out.println("...");
    }
}
class Kucing extends Hewan {
    // Mewarisi atribut nama dan method bersuara() dari Hewan
}
class Anjing extends Hewan {
    // Mewarisi atribut nama dan method bersuara() dari Hewan
}
public class Latihan1Hewan {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        kucingku.nama = "Mimi";
        System.out.println("Nama Kucing: " + kucingku.nama);
        kucingku.bersuara();
    }
}