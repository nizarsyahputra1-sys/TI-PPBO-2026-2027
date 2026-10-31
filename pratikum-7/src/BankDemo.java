public class BankDemo {
    public static void main(String[] args){
        RekeningBank rek = new RekeningBank("1001-001", "Budi","Tabungan",100000);
        RekeningBank rek2= new RekeningBank("2002-002","Siti aminah","Giro", 50000);

        System.out.println("-- Setor dan tarik rekening Budi --");
        rek.setor(250000);
        rek.tarik(100000);

        System.out.println("\n-- Setor dan tarik rekening Siti --");
        rek2.setor(300000);
        rek2.tarik(50000);

        System.out.println("\n--- Transfer BERHASIL: Budi -> Siti Rp400.000 ---");
        rek.transferKe(rek2, 400000);

        System.out.println("\n--- Transfer GAGAL: saldo tidak cukup ---");
        rek.transferKe(rek2, 5000000);

        System.out.println("\n--- Transfer GAGAL: jumlah tidak valid ---");
        rek.transferKe(rek2, -50000);

        System.out.println("\n--- Mutasi akhir ---");
        rek.cekMutasi();
        rek2.cekMutasi();
    }
}
