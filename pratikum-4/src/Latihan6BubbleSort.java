import java.util.Scanner;
public class Latihan6BubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int [] angka = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();

        }

        System.out.println("\nArray sebelum diurutkan: ");
        for (int i = 0; i < n; i++){
            System.out.print(angka[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - 1 - i; j++ ){
                if (angka[j] > angka [j + 1]){
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1]= temp;

                }
            }
        }
        System.out.print("Array sesudah diurutkan: ");
        for (int i = 0; i < n; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        input.close();

    }
}
