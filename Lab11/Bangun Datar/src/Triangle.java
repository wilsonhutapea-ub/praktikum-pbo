public class Triangle extends BangunDatar implements ICalculate{
    private double base;
    private double height;

    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.base * this.height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return this.base + this.height + this.calculateSpecial();
    }

    @Override
    public double calculateSpecial() {
        return Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2)));
    }

    @Override
    public void info() {
        System.out.printf("Shape name\t: %s\n", this.getName());
        System.out.printf("Base\t\t: %.2f\n", this.base);
        System.out.printf("Height\t\t: %.2f\n", this.height);
        System.out.printf("Area\t\t: %.2f\n", this.calculateArea());
        System.out.printf("Perimeter\t: %.2f\n", this.calculatePerimeter());
        System.out.printf("Sisi miring\t: %.2f\n\n", this.calculateSpecial());
    }
}
