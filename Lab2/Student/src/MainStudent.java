import java.util.Scanner;

public class MainStudent {
    static int numOfObjectCreated;
    public static void main(String[] args) {

        Student wilz = new Student(99, 100, 100);
        wilz.setName("Wilz");
        wilz.setAddress("Jekadah");
        wilz.setAge(19);
        wilz.displayMessage();

        Scanner sc = new Scanner(System.in);

        System.out.print("\nSilakan masukkan jumlah siswa yang ingin diinput: ");
        int q = sc.nextInt();

        Student[] studentArr = new Student[q];

        for(int i = 0; i < studentArr.length; i++){
            studentArr[i] = new Student();
            System.out.println("\nStudent ke-" + (i+1));
            System.out.println("Silakan input dibawah:");
            System.out.print("nama: ");
            studentArr[i].setName(sc.next());

            System.out.print("\nalamat: ");
            studentArr[i].setAddress(sc.next());

            System.out.print("\numur: ");
            studentArr[i].setAge(sc.nextInt());
            System.out.println("");

            System.out.print("\nNilai Math: ");
            studentArr[i].setMath(sc.nextInt());

            System.out.print("\nNilai English: ");
            studentArr[i].setEnglish(sc.nextInt());

            System.out.print("\nNilai Science: ");
            studentArr[i].setScience(sc.nextInt());

            studentArr[i].displayMessage();
        }





        // Student anna = new Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();

        // // menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();

        // // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        // System.out.println("===================");
        // anna = new Student("anna", "Batu", 18);
        // anna.displayMessage();

        // // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();

        // // objek dengan parameter nilai masing-masing mapel
        // Student budi = new Student(100, 90, 85);
        // budi.displayMessage();

        sc.close();
    }
}
