public class Sales extends Pegawai{
    private int totalPenjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this.totalPenjualan = penjualan;
        this.komisi = komisi;
    }

    public int getTotalPenjualan(){
        return this.totalPenjualan;
    }
    public double getKomisi(){
        return this.komisi;
    }
    public void setTotalPenjualan(int penjualan){
        this.totalPenjualan = penjualan;
    }
    public void setPenjualan(double komisi){
        this.komisi = komisi;
    }

    public double hitungGaji(){
        return this.totalPenjualan * this.komisi;
    }


    public String toString(){
        return String.format("%sPenjualan\t: %d\nKomisi\t\t: %.2f\n", super.toString(), this.totalPenjualan, this.komisi);
    }
}
