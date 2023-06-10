public abstract class Tanaman implements IPerawatan{
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public int getBuah() {
        return buah;
    }
    public void setBuah(int buah) {
        this.buah = buah;
    }
    public double getPerkembangan() {
        return perkembangan;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }
    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
    public int getMasaHidup() {
        return masaHidup;
    }
    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }
    public int getLamaHidup() {
        return lamaHidup;
    }
    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }
    public int getBerbuah() {
        return berbuah;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public abstract void berkembang();

    public String status(){
        return this.lamaHidup < this.masaHidup ? "Hidup" : "Mati";
    }
    public String toString(String namaTanaman){
        return String.format("Masa hidup: %d hari\nUmur tanaman: %d hari\nMenghasilkan: %d buah %s\nStatus: %s\n\n", this.masaHidup, this.lamaHidup, this.buah, namaTanaman, this.status());
    }

    

    
}
