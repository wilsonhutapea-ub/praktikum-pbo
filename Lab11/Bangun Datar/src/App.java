public class App {
    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle("Circle 1", 5);
        Square square1 = new Square("Square 1", 5);
        Triangle triangle1 = new Triangle("Triangle 1", 5, 3);

        circle1.info();
        square1.info();
        triangle1.info();
        System.out.println();


        BangunDatar[] bangunDatarArr = new BangunDatar[5];
        bangunDatarArr[0] = new Square("Square 2", 10);
        bangunDatarArr[1] = new Triangle("Triangle 2", 7, 8);
        bangunDatarArr[2] = new Kite("Kite 1", 13, 16, 9, 6);
        bangunDatarArr[3] = new Trapezoid("Trapezoid 1", 14, 12, 8);
        bangunDatarArr[4] = new Circle("Circle 2", 14);

        for (BangunDatar bangunDatar : bangunDatarArr) {
            BangunDatar bgnDtr = BangunDatar.getBangunDatarInstanceOf(bangunDatar);
            bgnDtr.info();
        }
        System.out.println();


        BangunDatar bd[] = new BangunDatar[7];
        bd[0] = new Circle("Circle", 37);
        bd[1] = new Trapezoid("Trapezoid", 24, 77, 40);
        bd[2] = new Triangle("Triangle", 56, 67);
        bd[3] = new Square("Persegi", 33);
        bd[4] = new Kite("Kite", 30, 12, 8, 7);
        bd[5] = new Trapezoid("Trapezoid", 10, 35, 8);
        bd[6] = new Kite("Kite", 12, 24, 7, 9);

        BangunDatar b = new FungsiBangunDatar();
        for (BangunDatar bgnDtr2 : bd) {
            BangunDatar.listBangunDatar.add(bgnDtr2.getName());
        }

        b.info();

        for(int i = 0; i < bd.length; i++) {
            System.out.printf("================ Bangun Datar %d ====================\n", i+1);
            bd[i].info();
        }

        System.out.println("==============================");
        System.out.println("Hasil pencarian:");
        System.out.println("==============================");
        b.search("kite");
        b.search("CiRcle");
        b.search("cube");
        System.out.println("==============================");
    }
}
