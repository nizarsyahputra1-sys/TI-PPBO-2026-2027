public class Latihan5Produk {
    public static void main(String[] args){
        Produk5 p = new Produk5("P001","Pulpen", 3500, 50);
        p.tampilkan();

        p.setHarga(-100);
        p.setHarga(4000);
        p.tambahStok(0);
        p.tambahStok(25);
        p.kurangiStok(-3);
        p.kurangiStok(100);
        p.kurangiStok(30);
        p.tampilkan();
    }
}
