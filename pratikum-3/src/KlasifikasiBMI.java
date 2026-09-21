import java.util.Scanner;
public class KlasifikasiBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        if (berat <= 0 || tinggiCm <= 0){
            System.out.println("Berat dan tinggi badan harus lebih dari 0!");

        }else {
            double tinggiM = tinggiCm / 100;
            double bmi = berat / (tinggiM * tinggiM);

            String kategori;

            if (bmi < 18.5 ){
                kategori = "Kurus";

            } else if (bmi < 25) {
                kategori = "Gemuk";

            }else {
                kategori = "Obesitas";

            }
            System.out.printf("BMI anda : %.1f%n",bmi);
            System.out.println("Kategori : " + kategori);
        }

        input.close();

    }
}
