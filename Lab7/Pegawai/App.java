public class App {
    public static void main(String[] args) {
        PegawaiTetap permanentEmployee = new PegawaiTetap("Gin", "3276050202020002", 10000000);
        permanentEmployee.sayHello("Nice.");
        System.out.println(permanentEmployee.toString());
        permanentEmployee.sayBye("Adios.");
        
        Pegawai employee = permanentEmployee;
        employee.sayHello();
        System.out.println(employee.toString());
        employee.sayBye();
        
        
        employee = new PegawaiHarian("Laura", "3276050101010001", 8500, 41);
        employee.sayHello();
        System.out.println(employee.toString());
        employee.sayBye();


        Pegawai employee1 = new Pegawai("Wilson Hamonangan Ariyanto Hutapea", "3276052701040008");
        System.out.println(employee1.toString());
        Pegawai employee2 = new Pegawai("Employee2", "3276056969694200");
        System.out.println(employee2.toString());

        PegawaiTetap permaEmployee1 = new PegawaiTetap("Pegawai Tetap 1", "3276050606060006", 15000000);
        System.out.println(permaEmployee1);
        PegawaiTetap permaEmployee2 = new PegawaiTetap("Pegawai Tetap 2", "3276050707070007", 20000000);
        System.out.println(permaEmployee2);

        PegawaiHarian tempEmployee1 = new PegawaiHarian("Pegawai Harian 1", "3276050808080008", 17000000, 9);
        System.out.println(tempEmployee1.toString());
        PegawaiHarian tempEmployee2 = new PegawaiHarian("Pegawai Harian 2", "3276050909090009", 24000000, 5);
        System.out.println(tempEmployee2.toString());
        
        Sales sales1 = new Sales("Si Paling Sales 1", "3276050303030003", 3, 200000);
        System.out.println(sales1.toString());
        Sales sales2 = new Sales("Si Paling Sales 2", "3276050404040004", 4, 400000);
        System.out.println(sales2.toString());
        Sales sales3 = new Sales("Si Paling Sales 3", "3276050505050005", 5, 600000);
        System.out.println(sales3.toString());

        
    }
}
