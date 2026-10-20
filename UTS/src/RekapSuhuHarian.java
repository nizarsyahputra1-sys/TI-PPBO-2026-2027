import java.util.Scanner;
public class RekapSuhuHarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama kota: ");
        String kota = input.nextLine();
        double[] suhu = new double[3];
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("Masukkan suhu hari " + (i + 1) + ": ");
            suhu[i] = Double.parseDouble(input.next().replace(',','.'));
        }

        double tertinggi = suhu[0];
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
        }
        String kategori;
        if (tertinggi >= 33) {
            kategori = "Panas";
        } else if (tertinggi >= 27) {
            kategori = "Hangat";
        } else if (tertinggi >= 20) {
            kategori = "Sejuk";
        } else {
            kategori = "Dingin";
        }

        System.out.println("Kota: " + kota);
        System.out.println("Suhu tertinggi: " + tertinggi);
        System.out.println("Kategori: " + kategori);

        input.close();
    }
}