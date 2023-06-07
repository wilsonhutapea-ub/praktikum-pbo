public class Square extends BangunDatar implements ICalculate{
    private double side;

    public Square(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    public double calculateSpecial() {
        return Math.sqrt((side*side) + (side *side));
    }

    @Override
    public void info() {
        System.out.printf("Shape name\t: %s\n", this.getName());
        System.out.printf("Side\t\t: %.2f\n", this.side);
        System.out.printf("Area\t\t: %.2f\n", this.calculateArea());
        System.out.printf("Perimeter\t: %.2f\n", this.calculatePerimeter());
        System.out.printf("Diagonal\t: %.2f\n\n", this.calculateSpecial());
    }
}
