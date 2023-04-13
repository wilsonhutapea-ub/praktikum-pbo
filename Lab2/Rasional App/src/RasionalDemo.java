public class RasionalDemo {
    public static void main(String[] args) {
        Rasional r1 = new Rasional(1,2);
        Rasional r2 = new Rasional(2,3);

        System.out.println("R1.isRasional: " + r1.isRasional());
        System.out.println("R2.isRasional: " + r2.isRasional());
        System.out.println();

        // System.out.println("R1 > R2 : " + r2.moreThan(r1));
        System.out.println("R1 > R2 : " + r1.moreThan(r2));
        System.out.println();

        System.out.print("R1 : ");
        r1.cetak();
        System.out.print("R2 : ");
        r2.cetak();
        System.out.println();

        r1.sederhana();
        r2.sederhana();

        System.out.print("R1 : ");
        r1.cetak();
        System.out.print("R2 : ");
        r2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : " );
        System.out.println("R1 : " + r1.cast());
        System.out.println("R2 : " + r2.cast());
        System.out.println();

        r1.negasi();
        System.out.print("Unary - dari R1 : ");
        r1.cetak();
        System.out.println();

        r1.unaryPlus(r2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        r1.cetak();
        System.out.println();

        r1.unaryMinus(r2);
        System.out.print("Nilai dari 'R1 -= R2' : ");
        r1.cetak();
        System.out.println();

        r1.unaryMultiply(r2);
        System.out.print("Nilai dari 'R1 *= R2' : ");
        r1.cetak();
        System.out.println();

        r1.unaryDivide(r2);
        System.out.print("Nilai dari 'R1 /= R2' : ");
        r1.cetak();
        System.out.println();

        


        
    }
}