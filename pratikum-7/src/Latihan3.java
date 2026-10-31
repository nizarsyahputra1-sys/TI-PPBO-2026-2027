public class Latihan3 {
    public static void main(String[] args){
        Waktu w = new Waktu(10,20,30);
        w.tampilkan();

        w.setJam(25);
        w.setMenit(60);
        w.setDetik(-5);
        w.tampilkan();

        w.setJam(23);
        w.setMenit(59);
        w.setDetik(0);
        w.tampilkan();
    }
}
