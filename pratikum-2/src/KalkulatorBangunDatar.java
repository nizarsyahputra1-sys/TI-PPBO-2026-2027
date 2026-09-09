//Nama   : Nizar Arashi Syahputra
//Nim    : 2025573010060
//Kelas  : TI.2A
//Program: KalkulatorBangunDatar.java
//Tugas  : Program menghitung luas dan keliling persegi panjang serta lingkaran,dan melakukan pengecekan kondisi luas


import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[] args){
        //Inisialisasi objek scanner untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("====KALKULATOR BANGUN DATAR ====");
        System.out.println();

        //Persegi Panjang
        System.out.println("1. PERSEGI PANJANG");
        System.out.println("Masukkan Panjang : ");
        double panjang = input.nextDouble();

        System.out.println("Masukkkan Lebar : ");
        double lebar = input.nextDouble();

        //Perhitungan luas dan keliling persegi panjang
        double LuasPersegiPanjang = panjang * lebar;
        double KelilingPersegiPanjang = 2 * (panjang + lebar);


        //Menampilkan hasil perhitungan persegi panjang
        System.out.println("Luas Persegi Panjang: " + LuasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + KelilingPersegiPanjang);

        //Pengecekan kondisi apakah luas persegi panjang lebih dari 100
        boolean LuasBesar = LuasPersegiPanjang > 100;
        System.out.println("Apakah Luas  > 100?      : " + LuasBesar);

        System.out.println();

        //LINGKARAN
        System.out.println(" 2. LINGKARAN");
        System.out.println("Masukkan jari-jari lingkaran : ");
        double jarijari = input.nextDouble();

        //Perhitungan luas dan keliling lingkaran menggunakan Math.PI
        double LuasLingkaran = Math.PI * jarijari * jarijari;
        double KelilingLingkaran = 2 * Math.PI * jarijari;

        //Menampilkan Hasil dari LINGKARAN
        System.out.println("Luas Lingkaran     : " + LuasLingkaran);
        System.out.println("Keliling Lingkaran :  " + KelilingLingkaran);


        //Menutup objek scanner setelah selesai digunakan
        input.close();

    }
}
