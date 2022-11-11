public class ManagerBeraksi {
    public static void main(String[] args) {
        Manager anton = new Manager();

        anton.setNama("Anton Santoso");
        anton.setGajiPokok(5000000);
        anton.setTunjangan(2500000);

        anton.cetakInfo();
    }
}