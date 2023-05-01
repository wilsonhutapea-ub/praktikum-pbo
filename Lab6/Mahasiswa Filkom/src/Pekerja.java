import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private Period lamaBekerja;
    private int jumlahAnak;

    public Pekerja(){}

    public Pekerja(String nama, boolean jenisKelaminLIsaki, String nik, boolean sudahMenikah, double gaji, int tahunMasuk, int jumlahAnak){
        super(nama, jenisKelaminLIsaki, nik, sudahMenikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.ofYearDay(tahunMasuk, 1);
        this.lamaBekerja = Period.between(this.tahunMasuk, LocalDate.now());
        this.jumlahAnak = jumlahAnak;
    }
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji(){
        return this.gaji;
    }
    public LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }
    public int getJumlahAnak(){
        return this.jumlahAnak;
    }

    public double getBonus(){
        double buffer;
        if(this.lamaBekerja.getYears() < 5){
            buffer = 0.05 * this.gaji;
        } else if(this.lamaBekerja.getYears() < 10){
            buffer = 0.1 * this.gaji;
        } else {
            buffer = 0.15 * this.gaji;
        }
        return (buffer + (20 * this.jumlahAnak));
    }
    
    public String toString(){
        return String.format("%sTahun Masuk: %d\nJumlah Anak: %d\nGaji: $%.2f\n", super.toString(), this.tahunMasuk.getYear(), this.jumlahAnak, this.gaji);
    }
}
