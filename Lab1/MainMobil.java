import java.util.*;

public class MainMobil {
    public static void main(String[] args) {
        
        Mobil m1 = new Mobil();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kecepatan mobil!");
        m1.setKecepatan(sc.nextInt());
        System.out.println("Masukkan manufaktur mobil!");
        sc.nextLine();
        m1.setManufaktur(sc.nextLine());
        System.out.println("Masukkan nopol!");
        m1.setNoPlat(sc.nextLine());
        System.out.println("Masukkan warna mobil!");
        m1.setWarna(sc.nextLine());
        System.out.println("Masukkan waktu yang ditempuh");
        m1.setWaktu(sc.nextInt());
        m1.hitungJarak();
        m1.displayMessage();
        System.out.println("================");
        
        // buat jadi interaktif
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        //menampilkan hasil perubahan
        m1.displayMessage();
        sc.close();
    }
}