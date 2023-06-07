public class Kite extends BangunDatar implements ICalculate{
    private double diagonal1;
    private double diagonal2;
    private double sisiMiring1;
    private double sisiMiring2;

    public Kite(String name, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2){
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this. sisiMiring2 = sisiMiring2;
    }

    @Override
    public double calculateArea() {
        return (1/2 * this.diagonal1 * this.diagonal2);
    }

    @Override
    public double calculatePerimeter() {
        return (2*(sisiMiring1 + sisiMiring2));
    }

    @Override
    public double calculateSpecial() {
        double hypotenuse = Math.min(this.sisiMiring1, this.sisiMiring2);
        double diagonal = Math.min(diagonal1, diagonal2);
        double height = Math.sqrt(Math.pow(Math.max(diagonal, hypotenuse), 2)  - Math.min(diagonal, hypotenuse));
        return 0.5 * height * diagonal;
    }

    @Override
    public void info() {
        System.out.printf("Shape name\t: %s\n", this.getName());
        System.out.printf("Diagonal 1\t: %.2f\n", this.diagonal1);
        System.out.printf("Diagonal 2\t: %.2f\n", this.diagonal2);
        System.out.printf("Sisi Miring 1\t: %.2f\n", this.sisiMiring1);
        System.out.printf("Sisi Miring 2\t: %.2f\n", this.sisiMiring2);
        System.out.printf("Area\t\t: %.2f\n", this.calculateArea());
        System.out.printf("Perimeter\t: %.2f\n", this.calculatePerimeter());
        System.out.printf("Luas ABD1\t: %.2f\n\n", this.calculateSpecial());
    }
}
