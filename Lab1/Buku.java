import java.util.Scanner;

public class Buku {

    int isiLembarBuku;
    int kataPerHari;
    double halamanBukuPerHari;
    int waktuMenghabiskanBuku;
    
    Buku(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan isi lembar buku!");
        isiLembarBuku= sc.nextInt();
        System.out.println("Masukkan kata yang ditulis perhari!");
        kataPerHari = sc.nextInt();
        System.out.println("Masukkan halaman buku yang habis perhari!");
        halamanBukuPerHari = sc.nextDouble();
        sc.close();       
    }

    void hitungWaktuMenghabiskanBuku(){
        waktuMenghabiskanBuku = (int)(isiLembarBuku * 2 / halamanBukuPerHari);
        showWaktuMenghabiskanBuku();
    }

    void showWaktuMenghabiskanBuku(){
        System.out.println(waktuMenghabiskanBuku);
    }
    public static void main(String[] args) {
        Buku b = new Buku();
        b.hitungWaktuMenghabiskanBuku();
    }
}
