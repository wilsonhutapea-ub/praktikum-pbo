public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, boolean jenisKelaminLIsaki, String nik, boolean sudahMenikah, double gaji, int tahunMasuk, int jumlahAnak, String departemen){
        super(nama, jenisKelaminLIsaki, nik, sudahMenikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return this.departemen;
    }

    public double getBonus(){
        return (super.getBonus() + 0.1 * getGaji());
    }
    public String toString(){
        return String.format("%sDepartemen: %s\n", super.toString(), this.departemen);
    }
}
