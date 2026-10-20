public class Persegi {
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;

    }
    double hitungLuas(){
        return sisi * sisi;
    }

    double hitungKeliling(){
        return 4 * sisi;
    }
}
