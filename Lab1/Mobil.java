public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i); // input dalam km/h, diubah jadi m/s
    }
    public void setWaktu(double d){
        waktu = rubahSekon(d); // input dalam satuan jam, diubah jadi sekon
    }
    private double rubahSekon(double d){
        return d * 3600;
    }
    private double rubahKecepatan(double d){
        return d * 1000 / 3600; // mengubah km/h jadi m/s
    }
    public void hitungJarak(){
        jarak = kecepatan * waktu; // dalam km
    }
    public double rubahMeter(double d){
        return d / 1000;
    }
    public void displayMessage(){
        System.out.println("\nMobil anda bermerek "+ manufaktur);
        System.out.println("mempunyai nomor plat "+ noPlat);
        System.out.println("serta memililki warna "+ warna);
        System.out.printf("dan mampu menempuh kecepatan %.2f km/jam\n", kecepatan);
        System.out.printf("Jarak yang dapat ditempuh adalah %.2f m\n", jarak);
        System.out.printf("%.2f m dalam bentuk km adalah %.2f km\n", jarak, rubahMeter(jarak));
        System.out.println();
    }
}