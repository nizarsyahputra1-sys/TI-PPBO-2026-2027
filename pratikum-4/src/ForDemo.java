public class ForDemo {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            System.out.println("Perulangan ke-" + i);
            for (int j = 5; j >= 1; j--){
                System.out.println("Hitung mundur: " + i);
            }
            System.out.println("Selesaii");
        }
    }
}