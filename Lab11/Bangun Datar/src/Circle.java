public class Circle extends BangunDatar implements ICalculate {
    private double radius;
    private final double PI = Math.PI;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return this.PI * 2 * this.radius;
    }

    @Override
    public double calculateSpecial() {
        double sector = this.calculateArea() / 4;
        double triangle = 0.5 * radius * radius;
        return sector - triangle;
    }

    @Override
    public void info() {
        System.out.printf("Shape name\t: %s\n", this.getName());
        System.out.printf("Radius\t\t: %.2f\n", this.radius);
        System.out.printf("Pi\t\t: %.2f\n", this.PI);
        System.out.printf("Area\t\t: %.2f\n", this.calculateArea());
        System.out.printf("Perimeter\t: %.2f\n", this.calculatePerimeter());
        System.out.printf("Segment\t\t: %.2f\n\n", this.calculateSpecial());

    }
}
