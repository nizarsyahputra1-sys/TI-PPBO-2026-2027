import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.println("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        int terbesar;

        if (a >= b && a >= c){
            terbesar = a;
            
        } else if (b >= a && b >= c) {
            terbesar = b;

            
        }else {
            terbesar = c;

        }

        System.out.println("Bilangan terbesar adalah " + terbesar);

        input.close();
    }
}
