public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("Siti", "4567",3.90);
        m2.tampilkanData();

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println("Cumlaude? " + m2.isCumlaude());

    }
}
