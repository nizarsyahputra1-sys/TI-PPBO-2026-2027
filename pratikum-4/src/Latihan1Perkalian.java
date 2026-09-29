import java.util.Scanner;
public class Latihan1Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {

            System.out.println("Masukkan sebuah bilangan: ");
            int angka = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(angka + " x " + i + " = " + (angka * i));
            }
            System.out.print("\nHitung bilangan lain? (y/t): ");
            ulangi = input.next().charAt(0);
            System.out.println();

        } while (ulangi == 'y' || ulangi == 'Y');
        System.out.println("Program Selesai.");
        input.close();

    }
}
