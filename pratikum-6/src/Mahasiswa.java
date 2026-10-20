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

}