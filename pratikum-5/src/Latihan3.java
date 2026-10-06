public class Latihan3 {
    static double konversiSuhu(double celsius){
        return celsius *9 / 5 + 32;
    }
    static double konversiSuhu(double celsius, String skalaTujuan){
        if (skalaTujuan.equalsIgnoreCase("Kelvin")){
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return celsius * 9 / 5 + 32;
            
        }else {
            System.out.println("Skala tidak dikenal: " +skalaTujuan);
            return Double.NaN;
        }
    }
    public static void main(String[] args){
        System.out.println("100 C ke Fahrenheit : " + konversiSuhu(100));
        System.out.println("100 C ke Fahrenheit : " + konversiSuhu(100, "Fahrenheit"));
        System.out.println("100 C ke Kelvin : " + konversiSuhu(100, "Kelvin"));
        System.out.println("0 C ke Kelvin : " + konversiSuhu(0,"Kelvin"));
    }
}
