public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;
    private int hariKerjaPerMinggu;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
        this.hariKerjaPerMinggu = 5;
    }
    
    public double getUpahPerJam(){
        return this.upahPerJam;
    }
    public int getTotalJam(){
        return this.totalJam;
    }
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }
    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }

    public double hitungGaji(){
        if(this.totalJam <= 40){
            return this.upahPerJam * this.totalJam;
        } else {
            return (40 * this.upahPerJam) + ((this.totalJam - 40) * this.upahPerJam * 1.5);
        }
    }

    public void sayHello(String whatToStay){
        System.out.printf("Hello, I am Pegawai Harian. %s\n", whatToStay);
    }
    public void sayBye(String whatToSay){
        System.out.printf("Bye! %s\n\n", whatToSay);
    }

    public String toString(){
        return String.format("%sUpah per Jam\t: IDR %,.2f\nTotal jam\t: %d\nGaji\t\t: IDR %,.2f\n", super.toString(), this.upahPerJam, this.totalJam, this.hitungGaji());
    }

}
