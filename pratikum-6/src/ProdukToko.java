public class ProdukToko {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public ProdukToko(String kodeProduk, String namaProduk, double harga, int stok){
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;

    }
    double hitungTotalHarga(int jumlahBeli){
        return harga * jumlahBeli;
    }

    void kurangiStok(int jumlah){
        if (stok >= jumlah){
            stok -= jumlah;
        }else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    void tampilkanData(){
        System.out.println("Kode : " + kodeProduk);
        System.out.println("Nama : " + namaProduk);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }
}
