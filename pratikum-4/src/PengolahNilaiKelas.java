import java.util.Scanner;
public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int KKM = 70;

        System.out.println("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

        }

        int[] nilaiAsli = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiAsli[i] = nilai[i];
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
5
        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];

            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            if (nilai[i] >= KKM) {
                jumlahLulus++;

            } else {
                jumlahTidakLulus++;

            }
        }
        double rataRata = (double) total / n;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;

                }
            }
        }

        System.out.println("\n=================================================");
        System.out.println("                LAPORAN NILAI UJIAN KELAS");
        System.out.println("===================================================");
        System.out.println("Jumlah mahasiswa    : " + n);
        System.out.println("KKM (nilai kelulusan) : " + KKM);

        System.out.println("\nNilai sebelum diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiAsli[i] + " ");

        }
        System.out.println("\nNilai setelah diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println("\n\n------------------------------------- STATISTIK---------------------------------");
        System.out.printf("Rata-rata kelas : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah :" + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        System.out.println("==================================================================================");

        input.close();
    }

    }
