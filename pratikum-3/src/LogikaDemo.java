public class LogikaDemo {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        int kehadiran = 90;

        if (nilaiUjian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS mata kuliah");

        } else {
            System.out.println("TIDAK LULUS mata kuliah");
        }
        System.out.println();

        boolean punyaKtp = false;
        boolean punyaSim = true;

        if (punyaKtp || punyaSim) {
            System.out.println("Boleh menyewa kendaraan");

        }
        if (!punyaKtp) {
            System.out.println("KTP belum tersedia");
        }

    }
}