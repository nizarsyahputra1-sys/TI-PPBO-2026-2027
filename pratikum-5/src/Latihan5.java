public class Latihan5 {
    static int hitungTotal(int[] data){
        int total = 0;
        for (int nilai : data){
            total += nilai;
        }
        return total;
    }
    static int[] filterDiatasRataRata(int[] data){
        double rataRata = (double) hitungTotal(data) / data.length;

        int jumlah = 0;
        for (int nilai : data){
            if (nilai > rataRata){
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
        int idx = 0;
        for (int nilai : data){
            if (nilai > rataRata){
                hasil[idx++] = nilai;
            }
        }
        return hasil;
    }

    public static void main(String[] args){
        int[] nilaiUjian = {80, 75, 90, 60, 88};

        System.out.println("Total: " + hitungTotal(nilaiUjian));

        int[] diAtas = filterDiatasRataRata(nilaiUjian);
        System.out.print("Di atas rata-rata: ");
        for (int n : diAtas){
            System.out.print(n + " ");
        }
    }
}
