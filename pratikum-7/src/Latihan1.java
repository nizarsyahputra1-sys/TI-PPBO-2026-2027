import java.lang.classfile.instruction.TableSwitchInstruction;

public class Latihan1 {
    public static void main(String[] args){
        Buku b = new Buku("Pemograman java", "Budi santoso", 2020);

        System.out.println("Judul: " + b.getJudul());
        System.out.println("Pengarang: " + b.getPengarang());
        System.out.println("Tahun: " +b.getTahunTerbit());
    }
}
