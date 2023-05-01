public class App {
    public static void main(String[] args){
        
        Manusia priaSudahMenikah = new Manusia("Anto (Pria, Sudah Menikah)", true, "3276050101010001", true);
        Manusia perempuanSudahMenikah = new Manusia("Sarah (Perempuan, Sudah Menikah)", false, "3276050202020002", true);
        Manusia belumMenikah = new Manusia("Fred (Belum Menikah)", true, "3276050303030003", false);
        MahasiswaFILKOM ipkUnder3 = new MahasiswaFILKOM("Tony (IPK dibawah 3)", true, "3276050404040004", false, "205150200444044", 2);
        MahasiswaFILKOM ipkUnder3_5 = new MahasiswaFILKOM("Jeff (IPK dibawah 3.5)", true, "3276050505050005", false, "195150400555055", 3.2);
        MahasiswaFILKOM wilson = new MahasiswaFILKOM("Wilson", true, "3276052701040008", false, "225150600111022", 4);
        Pekerja john = new Pekerja("John", true, "3276050606060006", true, 1500, 2021, 2);
        Pekerja budi = new Pekerja("Budi", true, "3276050707070007", false, 3000, 2014, 0);
        Pekerja sam = new Pekerja("Sam", true, "3276050808080008", true, 6000, 2003, 10);
        Manager manager = new Manager("Manager", false, "3276050909090009", false, 7500, 2015, 0, "Operation");

        System.out.println(priaSudahMenikah.toString());
        System.out.println(perempuanSudahMenikah.toString());
        System.out.println(belumMenikah.toString());
        System.out.println(ipkUnder3.toString());
        System.out.println(ipkUnder3_5.toString());
        System.out.println(wilson.toString());
        System.out.println(john.toString());
        System.out.println(budi.toString());
        System.out.println(sam.toString());
        System.out.println(manager.toString());

    }
}
