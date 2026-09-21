import java.util.Scanner;
public class Ganjilgenap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        if(bilangan % 2 == 0){
            System.out.println(bilangan + "  adalah bilangan bulat");

        }else {
            System.out.println(bilangan + "  adalah bilangan ganjil");
        }
        input.close();
    }
}
