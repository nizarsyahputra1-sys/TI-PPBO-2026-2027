public class Latihan2 {
    public static void main(String[] args){
        Persegi p1 = new Persegi(6);
        Persegi p2 = new Persegi(4);
        Persegi p3 = new Persegi(9);

        System.out.println("Sisi " + p1.sisi + "-> Luas: " + p1.hitungLuas() + ", Keliling: " + p1.hitungKeliling());
        System.out.println("Sisi " + p2.sisi + "-> Luas: " + p2.hitungLuas() + ", Keliling: " + p2.hitungKeliling());
        System.out.println("Sisi " + p3.sisi + "-> Luas: " + p3.hitungLuas() + ", Keliling: " + p3.hitungKeliling());


    }
}
