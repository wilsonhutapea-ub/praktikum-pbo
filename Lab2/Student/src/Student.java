public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student() {
        MainStudent.numOfObjectCreated++;
    }
    
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        MainStudent.numOfObjectCreated++;
    }
    
    public Student(double m, double e, double s){
        this.mathGrade = m;
        this.englishGrade = e;
        this.scienceGrade = s;
        MainStudent.numOfObjectCreated++;
    }

    void jumlahObjek(){
        System.out.println(MainStudent.numOfObjectCreated);
    }
    
    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }

    boolean statusAkhir(){
        if (getAverage() >= 61){
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("================================");
        System.out.println("Siswa dengan nama "+ name);
        System.out.println("beralamat di "+ address);
        System.out.println("berumur "+ age);
        System.out.printf("mempunyai nilai rata-rata: %.2f\n", getAverage());
        System.out.print("Status akhir nilai lulus: ");
        if(statusAkhir() == true){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        System.out.println("==================================");
    }
}