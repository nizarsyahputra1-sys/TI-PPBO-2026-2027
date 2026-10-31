public class Latihan2 {
    public static void main(String[] args) {
        Buku b = new Buku("Pemrograman Java", "Budi Santoso", 2020);
        System.out.println("Sebelum: " + b.getJudul() + " | " + b.getPengarang() + " | " + b.getTahunTerbit());

        b.setJudul("Pemograman Java Lanjut");
        b.setPengarang("Siti Aminah");
        System.out.println("Sesudah : " + b.getJudul() + " | " + b.getPengarang() + " | " + b.getTahunTerbit());
    }

}
