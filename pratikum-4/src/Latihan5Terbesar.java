import java.util.Scanner;
public class Latihan5Terbesar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Masukkan elemen ke-" + (i+1)+": ");
            angka[i] = input.nextInt();

        }
        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if (angka[i] > terbesar){
                terbesarKedua = terbesar;
                terbesar = angka[i];

            }else if (angka[i] > terbesarKedua && angka[i] != terbesar){
                terbesarKedua = angka[i];
            }
        }
        if (terbesarKedua == Integer.MIN_VALUE){
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen atau array terlalu kecil).");

        }else {
            System.out.println("Nilai terbesar: " + terbesar);
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);

        }
        input.close();

    }
}
