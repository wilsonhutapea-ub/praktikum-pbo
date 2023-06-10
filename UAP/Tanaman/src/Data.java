import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<Tanaman>(3);
    public static ArrayList<Integer> lokasi = new ArrayList<Integer>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai(){
        // System.out.print("Ingin menanam berapa? :");
        // int jumlah = in.nextInt();
        // System.out.print("Masa tanam (dlm bulan) : ");
        // int lamaHidup = 30 * (in.nextInt());
        // System.out.println();
        // System.out.println("(delete) Jumlah: " + 3 + "\nMasa tanam: " + lamaHidup + " hari");
        
        System.out.print("Masa tanam (dlm bulan) : ");
        int lamaHidup = 30 * (in.nextInt());
        for(int i = 0; i < 3; i++){
            menanam(lamaHidup);
        }
        for(int i = 0; i < Data.tanamans.get(0).getLamaHidup(); i++){
            for (Tanaman tanaman : Data.tanamans) {
                if(tanaman.status().equalsIgnoreCase("Hidup")){
                    tanaman.berkembang();
                }
                if(i % 90 == 0){
                    tanaman.treatment();
                }
            }
        }
        

    }

    public static void menanam(int masaTanam){
        System.out.println("Mau menanam apa?");
            System.out.println("1. Tomat");
            System.out.println("2. Stroberi");
            System.out.println("3. Persik");
            int tanam = in.nextInt();
            System.out.println("\n");
            switch(tanam){
                case 1 : {
                    Data.tanamans.add(new Tomat(masaTanam));
                    break;
                }
                case 2 : {
                    Data.tanamans.add(new Stroberi(masaTanam));
                    break;
                }
                case 3 : {
                    Data.tanamans.add(new Persik(masaTanam));
                    break;
                }
            }
        System.out.println("Berhasil menanam!");
    }

    public static void info(){
        System.out.println("======== HASIL MENANAM =========");
        int i = 1;
        for (Tanaman tanaman : Data.tanamans) {
            System.out.println("Tanaman buah ke-" + i);
            tanaman.toString();
            i++;
        }
    }
}