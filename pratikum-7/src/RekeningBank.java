import java.awt.desktop.SystemSleepEvent;
import java.util.Locale;

public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private final String jenisRekening;

    public RekeningBank(String nomor,String pemilik,String jenisRekening, double saldoAwal){
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }
    public String getNomorRekening(){
        return nomorRekening;
    }
    public String getPemilik(){
        return pemilik;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getJenisRekening(){
        return jenisRekening;
    }
    public void setor(double jumlah){
        if (jumlah <= 0){
            System.out.println("Jumalah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }
    public void tarik(double jumlah){
        if (jumlah <= 0){
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
            
        }else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null || tujuan == this) {
            System.out.println("Transfer GAGAL: rekening tujuan tidak valid");
        } else if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: jumlah transfer harus lebih dari 0 (diberikan: " + jumlah + ")");
        } else if (jumlah > saldo) {
            System.out.println("Transfer GAGAL: saldo tidak mencukupi (saldo: " + saldo + ", diminta: " + jumlah + ")");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL: " + jumlah + " dari " + this.nomorRekening
                    + " (" + this.pemilik + ") ke " + tujuan.nomorRekening + " (" + tujuan.pemilik + ")");
        }
    }
    public void cekMutasi(){
        String garis= "=".repeat(40);
        System.out.println(garis);
        System.out.println("          LAPORAN MUTASI REKENING");
        System.out.println(garis);
        System.out.printf("%-16s: %s%n", "Nomor Rekening", nomorRekening);
        System.out.printf("%-16s: %s%n", "Pemilik", pemilik);
        System.out.printf("%-16s: %s%n", "Jenis Rekening", jenisRekening);
        System.out.printf("%-16s: Rp%s%n", "Saldo Saat Ini", String.format(Locale.forLanguageTag("id-ID"), "%,.2f", saldo));
        System.out.println(garis);
    }
}

