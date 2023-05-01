public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus){
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
