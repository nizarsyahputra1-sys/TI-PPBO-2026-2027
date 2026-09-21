import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        if (umur < 0){
            System.out.println("Umur tidak valid!");

        }else {
            int harga;
            String kategori;

            if (mahasiswa && umur < 25){
                harga = 30000;
                kategori = "Mahasiswa";
                
            } else if (umur < 12 || umur >=60) {
                harga = 25000;
                kategori = "anak anak/ Lansia";

                
            }else {
                harga = 50000;
                kategori = "Umum";

            }
            System.out.println("Kategori : " + kategori);
            System.out.println("Harga Tiket : Rp " + harga );

        }

        input.close();
    }
}
