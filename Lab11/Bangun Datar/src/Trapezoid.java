public class Trapezoid extends BangunDatar implements ICalculate {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(String name, double base1, double base2, double height){
        super(name);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.base1 * this.base2 / 2) * this.height;
    }

    @Override
    public double calculatePerimeter() {
        double shortBase = Math.abs((this.base1 - this.base2) / 2);
        double sisiMiringKuadrat = (Math.pow(height, 2) + Math.pow(shortBase, 2));
        return base1 + base2 + (2*Math.sqrt(sisiMiringKuadrat));
    }

    @Override
    public double calculateSpecial() {
        return (Math.min(base1, base2) * height);
    }

    @Override
    public void info() {
        System.out.printf("Shape name\t: %s\n", this.getName());
        System.out.printf("Base 1 Length\t: %.2f\n", this.base1);
        System.out.printf("Base 2 Length\t: %.2f\n", this.base2);
        System.out.printf("Height\t\t: %.2f\n", this.height);
        System.out.printf("Area\t\t: %.2f\n", this.calculateArea());
        System.out.printf("Perimeter\t: %.2f\n", this.calculatePerimeter());
        System.out.printf("Persegi ABCD\t: %.2f\n\n", this.calculateSpecial());
        

    }
}
