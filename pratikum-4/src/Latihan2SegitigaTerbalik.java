import java.util.Scanner;
public class Latihan2SegitigaTerbalik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tinggi/ukutan pola: ");
        int n = input.nextInt();

        System.out.println("\nSetiga terbalik:");
        for (int baris = n; baris >= 1; baris--){
            for (int kolom = 1; kolom <= baris; kolom++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPersegi:");
        for (int baris = 1; baris <= n; baris++){
            for (int kolom = 1; kolom <= n; kolom++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
