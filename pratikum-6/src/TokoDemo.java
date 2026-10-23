import java.util.Locale;
public class TokoDemo {
    public static void main(String[] args){
        ProdukToko[] daftar = {
                new ProdukToko("P001", "Mousepad", 45500, 20),
                new ProdukToko("P002", "Keyboard", 150000, 10),
                new ProdukToko("P003", "Mouse", 75000, 15),
                new ProdukToko("P004", "Monitor", 1850000, 5),
                new ProdukToko("P005", "Headset", 320000, 8)
        };
                System.out.println("====DAFTAR PRODUK====");
                for (int i = 0; i < daftar.length; i++){
                    daftar[i].tampilkanData();


        }
                System.out.println("===PEMBELIAN===");

                ProdukToko p1 = daftar[1];
                int beli1 = 3;
                System.out.println("Beli " + beli1 + " " + p1.namaProduk);
                System.out.println("Total harga : " + ProdukToko.formatRupiah(p1.hitungTotalHarga(beli1)));
                System.out.println("Stok Sebelumnya: " + p1.stok);
                p1.kurangiStok(beli1);
                System.out.println("Stok Sesudah: " + p1.stok);
                System.out.println();

                 ProdukToko p2 = daftar[3];
                 int beli2 = 10;
                 System.out.println("Beli " + beli2 + " " + p2.namaProduk);
                 System.out.println("Total harga : " + ProdukToko.formatRupiah(p2.hitungTotalHarga(beli2)));
                 System.out.println("Stok Sebelumnya: " + p2.stok);
                 p2.kurangiStok(beli2);
                 System.out.println("Stok Sesudah: " + p2.stok);
                 System.out.println();

                 ProdukToko termahal = daftar[0];
                 for (int i = 1; i < daftar.length; i++){
                     if (daftar[i].harga > termahal.harga){
                         termahal = daftar[i];
                     }
                 }

                 System.out.println("PRODUK TERMAHAL");
                 termahal.tampilkanData();
    }
}
