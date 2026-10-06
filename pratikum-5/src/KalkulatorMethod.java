import java.util.Arrays;
import java.util.Scanner;
public class KalkulatorMethod {

    static double tambah(double a, double b){
        return a + b;

    }
    static double tambah(double a, double b, double c){
        return a + b + c;

    }
    static double kurang(double a, double b){
        return a - b;
    }
    static double kali(double a, double b){
        return a * b;
    }
    static double bagi(double a, double b){
        return a / b;
    }
    static double pangkat(double basis, double eksponen){
        return Math.pow(basis, eksponen);
    }
    static double akarKuadrat(double a){
        return Math.sqrt(a);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil){
        if (riwayatHasil.length == 0){
            return Double.NaN;
        }
        double max = riwayatHasil[0];
        for (double nilai : riwayatHasil){
            if (nilai > max){
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] riwayat = new double[10];
        int jumlahRiwayat = 0;

        int pilihan;
        do {
            System.out.println();
            System.out.println("===== KALKULATOR METHOD =====");
            System.out.println("1. Tambah (2 angka)");
            System.out.println("2. Tambah (3 angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            double hasil = 0;
            boolean berhasil = true;

            switch (pilihan){
                case 1: {
                    System.out.print("Angka pertama: ");
                    double a = input.nextDouble();
                    System.out.print("Angka kedua: ");
                    double b = input.nextDouble();
                    hasil = tambah(a, b);
                    break;
                }
                case 2: {
                    System.out.print("Angka pertama: ");
                    double a = input.nextDouble();
                    System.out.print("Angka kedua: ");
                    double b = input.nextDouble();
                    System.out.print("Angka ketiga: ");
                    double c = input.nextDouble();
                    hasil = tambah(a, b, c);
                    break;
                }
                case 3: {
                    System.out.print("Angka pertama: ");
                    double a = input.nextDouble();
                    System.out.print("Angka kedua: ");
                    double b = input.nextDouble();
                    hasil = kurang(a, b);
                    break;
                }
                case 4: {
                    System.out.print("Angka pertama: ");
                    double a = input.nextDouble();
                    System.out.print("Angka kedua: ");
                    double b = input.nextDouble();
                    hasil = kali(a, b);
                    break;
                }
                case 5: {
                    System.out.print("Angka pertama (yang dibagi): ");
                    double a = input.nextDouble();
                    System.out.print("Angka kedua (pembagi): ");
                    double b = input.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: tidak bisa dibagi dengan nol.");
                        berhasil = false;
                    } else {
                        hasil = bagi(a, b);
                    }
                    break;
                }
                case 6: {
                    System.out.print("Bilangan pokok: ");
                    double a = input.nextDouble();
                    System.out.print("Pangkat: ");
                    double b = input.nextDouble();
                    hasil = pangkat(a, b);
                    break;
                }
                case 7: {
                    System.out.print("Angka: ");
                    double a = input.nextDouble();
                    if (a < 0) {
                        System.out.println("Error: akar kuadrat dari bilangan negatif tidak didefinisikan.");
                        berhasil = false;
                    } else {
                        hasil = akarKuadrat(a);
                    }
                    break;
                }
                case 0:
                    berhasil = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    berhasil = false;
            }
            if (berhasil){
                System.out.println("Hasil: " + hasil);

                if (jumlahRiwayat == riwayat.length){
                    riwayat = Arrays.copyOf(riwayat, riwayat.length * 2);
                }
                riwayat[jumlahRiwayat] = hasil;
                jumlahRiwayat++;
            }

        }while (pilihan != 0);
        System.out.println();
        if (jumlahRiwayat == 0){
            System.out.println("Tidak ada perhitungan yang dilakukan.");

        }else {
            double[] riwayatTerisi = Arrays.copyOf(riwayat, jumlahRiwayat);
            System.out.println("Jumlah perhitungan: " + jumlahRiwayat);
            System.out.println("Hasil terbesar yang pernah dihitung: " + riwayatKeMaksimum(riwayatTerisi));

        }
        System.out.println("Terima kasih!");

        input.close();
    }

}
