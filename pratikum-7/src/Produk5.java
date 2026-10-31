public class Produk5 {
    private final String kodeProduk;
    private final String namaProduk;
    private double harga;
    private int stok;

    public Produk5(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Ditolak: stok awal tidak boleh negatif, diset 0");
            this.stok = 0;
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Ditolak: harga tidak boleh negatif (diberikan: " + harga + ")");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Ditolak: jumlah tambah stok harus positif (diberikan: " + jumlah + ")");
        }
        stok += jumlah;
        System.out.println("Stok bertambah " + jumlah + ". Stok sekarang: " + stok);
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Ditolak: jumlah kurangi stok harus positif (diberikan: " + jumlah + ")");
            return;
        }
        if (jumlah > stok) {
            System.out.println("Ditolak: stok tidak cukup (stok: " + stok + ", diminta: " + jumlah + ")");
            return;
        }
        stok -= jumlah;
        System.out.println("Stok berkurang " + jumlah + ". Stok sekarang: " + stok);
    }
    public void tampilkan(){
        System.out.printf("[%s] %s | Harga: Rp%,.0f | Stok: %d%n",
                kodeProduk, namaProduk, harga, stok);
    }
}

