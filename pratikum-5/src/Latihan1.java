public class Latihan1 {
    static double LuasPersegiPanjang(double p, double l){
        return p * l;
    }

    static double LuasLingkaran(double r){
        return Math.PI * r * r;
    }
    public static void main(String[] args){
        System.out.println("Persegi panjang 5 x 3 : " + LuasPersegiPanjang(5, 3));
        System.out.println("Persegi panjang 10 x 4 : " + LuasPersegiPanjang(10, 4));
        System.out.println("Persegi panjang 2.5 x 6 : " + LuasPersegiPanjang(2.5, 6));

        System.out.println("Lingkaran r = 7 : " + LuasLingkaran(7));
        System.out.println("Lingkaran r = 10 : " + LuasLingkaran(10));
        System.out.println("Lingkaran r = 3.5: " + LuasLingkaran(3.5));
    }
}
