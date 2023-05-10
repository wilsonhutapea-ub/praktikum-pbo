public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah(){
        return this.upah;
    }
    public void setUpah(double upah){
        this.upah = upah;
    }

    public void sayHello(String whatToStay){
        System.out.printf("Hello, I am Pegawai Tetap. %s\n", whatToStay);
    }
    public void sayBye(String whatToSay){
        System.out.printf("Bye! %s\n\n", whatToSay);
    }

    public String toString(){
        return String.format("%sUpah\t\t: IDR %.2f\n", super.toString(), this.upah);
    }
}
