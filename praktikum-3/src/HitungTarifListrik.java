import java.util.Scanner;

public class HitungTarifListrik {
    static final double Tarif_450 = 415.0;
    static final double Tarif_900 = 1352.0;
    static final double Tarif_1300 = 1444.70;
    static final double Tarif_2200 = 1444.70;
    static final double Tarif_Above_2200 = 1699.53;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG TARIF LISTRIK");
        System.out.print("Masukkan Golongan Daya (450 / 900 / 1300 / 2200 / 3500): ");
        int daya = scanner.nextInt();

        System.out.print("Masukkan Pemakaian Listrik (kWh): ");
        double kwh = scanner.nextDouble();

        if (kwh <= 0) {
            System.out.println("\nError: Jumlah pemakaian kWh harus lebih besar dari 0!");
            scanner.close();
            return;
        }

        double tarifPerKwh = 0;
        boolean dayaValid = true;

        switch (daya) {
            case 450:
                tarifPerKwh = Tarif_450;
                break;
            case 900:
                tarifPerKwh = Tarif_900;
                break;
            case 1300:
                tarifPerKwh = Tarif_1300;
                break;
            case 2200:
                tarifPerKwh = Tarif_2200;
                break;
            default:
                if (daya > 2200) {
                    tarifPerKwh = Tarif_Above_2200;
                } else {
                    dayaValid = false;
                }
                break;
        }

        if (!dayaValid) {
            System.out.println("\nError: Golongan daya tidak valid!");
            scanner.close();
            return;
        }

        double totalTagihan = kwh * tarifPerKwh;

        System.out.println("\nRINCIAN TAGIHAN LISTRIK");
        System.out.println("Golongan Daya   : " + daya + " VA");
        System.out.println("Jumlah Pemakaian: " + kwh + " kWh");
        System.out.println("Tarif per kWh   : Rp " + String.format("%.2f", tarifPerKwh));
        System.out.println("Total Tagihan   : Rp " + String.format("%.2f", totalTagihan));

        scanner.close();
    }
}