public class Manusia{
    private String nama;
    private boolean jenisKelaminIsLaki;
    private String nik;
    private boolean sudahMenikah;

    public Manusia(){}
    public Manusia(String nama, boolean jenisKelaminLIsaki, String nik, boolean sudahMenikah){
        this.nama = nama;
        this.jenisKelaminIsLaki = jenisKelaminLIsaki;
        this.nik = nik;
        this.sudahMenikah = sudahMenikah;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJenisKelaminIsLaki(boolean jenisKelaminLIsaki){
        this.jenisKelaminIsLaki = jenisKelaminLIsaki;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setSudahMenikah(boolean sudahMenikah){
        this.sudahMenikah = sudahMenikah;
    }
    public String getNama(){
        return this.nama;
    }
    public boolean getJenisKelaminIsLaki(){
        return this.jenisKelaminIsLaki;
    }
    public String getNik(){
        return this.nik;
    }
    public boolean getSudahMenikah(){
        return this.sudahMenikah;
    }
    public String getSudahMenikahStr(){
        return this.sudahMenikah?"Sudah Menikah":"Belum Menikah";
    }

    public double getTunjangan(){
        if(this.sudahMenikah){
            return this.jenisKelaminIsLaki?25:20;
        } else {
            return 15;
        }
    }
    public double getPendapatan(){
        return 0;
    }
    public String toString(){
        return String.format("Nama: %s\nNIK: %s\nJenis Kelamin: %s\nJumlah Pendapatan: $%.2f\nStatus: %s\n", this.nama, this.nik, this.getJenisKelaminStr(), this.getPendapatan(), this.getSudahMenikahStr());
    }
    public String getJenisKelaminStr(){
        return this.jenisKelaminIsLaki?"Laki-laki":"Perempuan";
    }


}