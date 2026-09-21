import java.util.Scanner;
public class MenuMakanan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("==== Menu Makanan ====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie ayam");
        System.out.println("3. Sate ayam");
        System.out.println("4. Bakso");
        System.out.println("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("Anda memilih: Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih: Mie ayam");
                break;
            case 3:
                System.out.println("Anda memilih: Sate ayam");
                break;
            case 4:
                System.out.println("Anda memilih: Bakso");
                break;
            default:
                System.out.println("Pilihan tidak valid! Masukkan angka 1-4.");

        }
        input.close();

    }
}
