import java.util.Locale;
public class ProdukToko {
    String kodeProduk;
    String namaProduk;
    long harga;
    int stok;

    public ProdukToko(String kodeProduk, String namaProduk, long harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;

    }

    public static String formatRupiah(long angka) {
        return String.format(Locale.forLanguageTag("id-ID"), "Rp %,d", angka);
    }
    public long hitungTotalHarga(int jumlah) {
        return (long) (harga * jumlah);
    }

    public boolean kurangiStok(int jumlah) {
        if (jumlah > stok) {
            System.out.println("Stok tidak cukup! Diminta " + jumlah + ", tersedia " + stok);
            return false;
        }
        stok -= jumlah;
        return true;
    }
    void tampilkanData(){
        System.out.println("Kode : " + kodeProduk);
        System.out.println("Nama : " + namaProduk);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }
}
