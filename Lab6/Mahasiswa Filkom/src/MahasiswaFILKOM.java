public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelaminLIsaki, String nik, boolean sudahMenikah, String nim, double ipk){
        super(nama, jenisKelaminLIsaki, nik, sudahMenikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public String getNim(){
        return this.nim;
    }
    public double getIpk(){
        return this.ipk;
    }

    public String getStatus(){
        String angkatanStr = this.nim.substring(0, 2);
        String prodiStr = "";
        switch(Integer.parseInt(this.nim.substring(6, 7))){
            case 2: {
                prodiStr = "Teknik Informatika";
                break;
            }
            case 3: {
                prodiStr = "Teknik Komputer";
                break;
            }
            case 4: {
                prodiStr = "Sistem Informasi";
                break;
            }
            case 6: {
                prodiStr = "Pendidikan Teknologi Informasi";
                break;
            } 
            case 7: {
                prodiStr = "Teknologi Informasi";
                break;
            }
        }
        return String.format("%s, 20%s\n", prodiStr, angkatanStr);
    }
    public double getBeasiswa(){
        if(this.ipk >= 3 && this.ipk < 3.5){
            return 50;
        } else if(this.ipk >= 3.5 && this.ipk <= 4){
            return 75;
        } else {
            return 0;
        }
    }
    public String toString(){
        return String.format("%sNIM: %s\nIPK: %s\nAngkatan: %s", super.toString(), this.nim, this.ipk, this.getStatus());
    }
}
