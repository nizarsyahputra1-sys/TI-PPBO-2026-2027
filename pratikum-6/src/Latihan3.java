public class Latihan3 {
    public static void main(String[] args){
       Produk p1 = new Produk("Mousepad", 45500);
       Produk p2 = new Produk("Keyboard", 150000);

        System.out.println(p1.namaProduk + " mahal? " + p1.isMahal(55000));
        System.out.println(p1.namaProduk + " mahal? " + p2.isMahal(55000));

    }
}
