public class MethodDemo {
    //Method tidak mengembalikan nilai apapun

    static void sapa() {
        System.out.println("Halo,selamat datang!");

    }
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
        static void tampilkanBiodata(String nama, int umur, String kota){
            System.out.println(nama + " (" + umur + " tahun ) - " + kota);
        }

    public static void main(String[] args){
            sapa();
            sapa();
            sapa();

            sapa("Budi");
            sapa("Siti");

            tampilkanBiodata("Budi", 20, "Bandung");
        }
        }
