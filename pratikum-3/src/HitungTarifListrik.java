import java.util.Locale;
import java.util.Scanner;
public class HitungTarifListrik {
    static final double Tarif_450   = 415.0;
    static final double Tarif_900   = 1352.0;
    static final double Tarif_1300  = 1444.0;
    static final double Tarif_2200  = 1699.0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Locale indonesia = Locale.forLanguageTag("id-ID");

        System.out.println("=== HITUNG TARIF LISTRIK ===");
        System.out.println("Golongan daya: 450,900,1300,2200,atau diatas 2200 (mis. 3500)");

        System.out.println("Masukkan daya listrik (VA): ");
        int daya = input.nextInt();

        System.out.println("Masukkan pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        if (kwh < 0 || kwh == 0){
            System.out.println("Error: pemakaian kwh tidak boleh negatif atau nol!");

        }else {
            double tarif = 0;
            String golongan = "";
            boolean dayaValid = true;

            switch (daya){
                case 450:
                    tarif = Tarif_450;
                    golongan = "450 VA";
                    break;
                case 900:
                    tarif = Tarif_900;
                    golongan = "900 VA";
                    break;
                case 1300:
                    tarif = Tarif_1300;
                    golongan = "1300";
                    break;
                case 2200:
                    tarif = Tarif_2200;
                    golongan = "Di atas 2200 VA(" + daya + " VA)";
                    break;
                default:
                    if (daya > 2200){
                        tarif = Tarif_2200;
                        golongan = "Di atas 2200 VA ("+ daya + "VA)";


                    }else {
                        dayaValid = false;

                    }

            }
            if (!dayaValid){
                System.out.println("Error: golongan daya tidak valid! " + "Pilih 450,900,1300,2200.");

            }else {
                double total = kwh * tarif;


                System.out.println();
                System.out.println("===========================");
                System.out.println("       TAGIHAN LISTRIK            ");
                System.out.println("===========================");
                System.out.printf(indonesia,"Golongan daya : %s%n",golongan);
                System.out.printf(indonesia,"Pemakaian  : %,.2f kwh%n",kwh);
                System.out.printf(indonesia,"Tarif per kwh : Rp %,.2f%n",tarif);
                System.out.println("------------------------------");
                System.out.printf(indonesia,"Total tagihan : Rp %,.2f%n",total);
                System.out.println("==============================");


            }

        }

        input.close();

    }
}
