public class Latihan4 {
    public static void main(String[] args){
        Buku[] daftarBuku = {
          new Buku("Ada apa?", "Farhan ", 2005),
          new Buku("Seporsi Mie Ayam", "Khalil ",  2016),
          new Buku("Laut Bercerita", "Leila S. Chudori", 2017),
          new Buku("Atomic Habits", "James Clear", 2019)

        };

        System.out.println("Buku yang terbit setelah tahun 2015:");
        for (int i = 0; i < daftarBuku.length; i++){
            if (daftarBuku[i].tahunTerbit > 2015){
                System.out.println("- " + daftarBuku[i].judul);
            }


    }
    }
}
