public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik){
        setJam(jam);
        setMenit(menit);
        setDetik(detik);

    }
    public int getJam(){
        return jam;
    }
    public int getMenit(){
        return menit;
    }
    public int getDetik(){
        return detik;
    }

    public void setJam(int jam){
        if (jam >= 0 && jam <= 23){
            this.jam =jam;
        }else {
            System.out.println("Ditolak: jam harus 0-23 (diberikan: " + jam + ")");

        }
    }
    public void setMenit(int menit){
        if (menit >= 0 && menit <= 59){
            this.menit = menit;
        }else {
            System.out.println("Ditolak: menit harus 0-59 (diberikan: " + menit + ")");

        }
    }
    public void setDetik(int detik){
        if (detik >= 0 && detik <= 59){
            this.detik = detik;

        }else {
            System.out.println("Ditolak: detik harus 0-59 (diberikan: " + detik + ")");
        }
    }
    public void tampilkan(){
        System.out.printf("Waktu: :%02d :%02d %02d%n", jam,menit,detik);
    }

}
