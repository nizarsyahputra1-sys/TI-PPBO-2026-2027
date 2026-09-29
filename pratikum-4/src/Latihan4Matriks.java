import java.util.Scanner;
public class Latihan4Matriks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] [] matriks = new int[3][3];

        for (int baris = 0; baris <3; baris++){
            for (int kolom = 0; kolom < 3; kolom++){
                System.out.print("Masukkan elemen [" + baris + "][" + kolom + "]: ");
                matriks[baris][kolom] = input.nextInt();

            }
        }
        int totalSeluruh = 0;
        System.out.println();
        for (int baris = 0; baris < 3; baris++){
            int totalBaris = 0;
            for (int kolom = 0; kolom < 3; kolom++){
                totalBaris += matriks[baris][kolom];
            }
            System.out.println("Jumlah baris ke-" +(baris + 1) + ": " + totalBaris);
            totalSeluruh += totalBaris;
        }
        System.out.println("Jumlah seluruh elemen matriks: " + totalSeluruh);
        input.close();
    }
}
