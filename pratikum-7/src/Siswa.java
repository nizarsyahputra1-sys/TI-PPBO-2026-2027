public class Siswa {
    private double nilai;

    public Siswa(double nilai){
        setNilai(nilai);
    }
    public double getNilai(){
        return nilai;
    }
    public void setNilai(double nilai){
        if (nilai >= 0 && nilai <= 100){
            this.nilai = nilai;
        }else {
            System.out.println("Ditolak: nilai harus dari 0-100 (diberikan: " + nilai + ")");
        }
    }

    public String getNilaiHuruf(){
        if (nilai >= 85){
            return "A"; 
        } else if (nilai >= 70) {
            return "B";
            
        } else if (nilai >= 50) {
            return "C";

        } else if (nilai >= 40) {
            return "D";

        }else {
            return "E";
        }
    }
}


