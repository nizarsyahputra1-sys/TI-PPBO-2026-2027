public class Laatihan4Siswa {
        public static void main(String[] args){
            Siswa s = new Siswa(88.5);
            System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

            s.setNilai(105);
            s.setNilai(-10);
            System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());

            double[] uji = {90,75,60,45,20};
            for (double n : uji){
                s.setNilai(n);
                System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf());
            }

        }
    }

