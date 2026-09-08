import java.util.Scanner;
public class OperatorScanner {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int b = sc.nextInt();

        //Operasi Aritmatika
        System.out.println("\n==== Operator Aritmatika ====");
        System.out.println("Penjumlahan: " + (a+b));
        System.out.println("Pengurangan: " + (a-b));
        System.out.println("Perkalian: " + (a*b));
        System.out.println("Pembagian: " + (a/b));
        System.out.println("Sisa bagi: " + (a%b));

        // Operasi Perbandingan
        System.out.println("\n==== Operator Perbandingan ====");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b " +(a < b ));
        System.out.println("a == b: " + (a == b));

        sc.close();
    }
}
