public class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA MANAGER ===");
        Manager mgr = new Manager("Zakya Aqila", "M001", 7500000.0, 2500000.0);
        mgr.tampilkanData();

        System.out.println("\n=== DATA STAFF ===");
        Staff stf = new Staff("Budi Santoso", "S001", 4000000.0, 1000000.0);
        stf.tampilkanData();

        System.out.println("\n=== DATA DIREKTUR ===");
        Direktur dir = new Direktur("Dr. Ahmad", "D001", 15000000.0, 5000000.0, 10000000.0);
        dir.tampilkanData();
    }
}