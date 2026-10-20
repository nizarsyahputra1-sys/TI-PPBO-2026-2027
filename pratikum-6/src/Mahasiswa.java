import javax.swing.text.MaskFormatter;

public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    public Mahasiswa(String namaAwal, String nimAwal, double ipkAwal) {
        nama = namaAwal;
        nim = nimAwal;
        ipk = ipkAwal;
    }

    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);

    }
    public boolean isCumlaude(){
        return ipk >= 3.5;
    }

}