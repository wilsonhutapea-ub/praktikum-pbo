import java.util.ArrayList;

public abstract class BangunDatar {
    private String name;
    public static ArrayList<String> listBangunDatar = new ArrayList<String>(10);

    public BangunDatar(){}
    public BangunDatar(String nama){
        this.name = nama;
    }

    public void setName(String nama){
        this.name = nama;
    }
    public String getName(){
        return this.name;
    }

    public abstract void info();

    public void search(String find){
        int counter = 0;
        boolean found = false;
        for (String str : BangunDatar.listBangunDatar) {
            if(str.equalsIgnoreCase(find)){
                counter++;
                found = true;
            }
        }
        if(found){
            System.out.println(find + " found !");
            System.out.println("Jumlah: " + counter);
            int bykSudut = 0;
            String rumusLuas = "Not found";
            String rumusKeliling = "Not found";
            switch(find){
                case "Persegi": {
                    bykSudut = 4;
                    rumusLuas = "Sisi * Sisi";
                    rumusKeliling = "4 * Sisi";
                    break;
                }
                case "Circle": {
                    bykSudut = 0;
                    rumusLuas = "PI * r * r";
                    rumusKeliling = "PI * D";
                    break;
                }
                case "Triangle": {
                    bykSudut = 3;
                    rumusLuas = "Alas * Tinggi / 2";
                    rumusKeliling = "Alas + Sisi + Sisi";
                    break;
                }
                case "Kite": {
                    bykSudut = 4;
                    rumusLuas = "1/2 * Diagonal 1 * Diagonal 2";
                    rumusKeliling = "sisi + sisi + sisi + sisi";
                    break;
                }
                case "Trapezoid": {
                    bykSudut = 4;
                    rumusLuas = "1/2 * Jumlah panjang sisi sejajar * Tinggi";
                    rumusKeliling = "Alas atas + Alas bawah + Sisi kiri + Sisi kanan";
                    break;
                }
            }
            System.out.println("Banyak sudut: " + bykSudut);
            System.out.println("Rumus Luas: " + rumusLuas);
            System.out.println("Rumus Keliling: " + rumusKeliling);
        } else {
            System.out.printf("%s not found!\n", find);
        }
        System.out.printf("\n");
    };

    public static BangunDatar getBangunDatarInstanceOf(BangunDatar bangun){
        BangunDatar bangunDatar = null;
        if(bangun instanceof Square)
            bangunDatar = (Square)bangun;
        else if(bangun instanceof Triangle)
            bangunDatar = (Triangle) bangun;
        else if(bangun instanceof Circle)
            bangunDatar = (Circle) bangun;
        else if(bangun instanceof Trapezoid)
            bangunDatar = (Trapezoid) bangun;
        else if(bangun instanceof Kite)
            bangunDatar = (Kite)bangun;
        return bangunDatar;
    }
}
