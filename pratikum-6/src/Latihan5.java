public class Latihan5 {
    public static void main(String[] args){
        Persegi[] daftar = {
                new Persegi(4),
                new Persegi(9),
                new Persegi(6),
                new Persegi(2)

        };

        Persegi terbesar = daftar[0];
        for (int i = 1; i < daftar.length; i++){
            if (daftar[i].hitungLuas() > terbesar.hitungLuas()){
                terbesar = daftar[i];
            }
        }

        System.out.println("Persegi dengan luas terbesar: ");
        System.out.println("Sisi  : " + terbesar.sisi);
        System.out.println("Luas  : " + terbesar.hitungLuas());
    }
}
