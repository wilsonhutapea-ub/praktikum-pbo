public class FungsiBangunDatar extends BangunDatar{
    @Override
    public void info() {
        System.out.println("===================");     
        System.out.println("List Bangun Datar");   
        System.out.println("===================");
        int i = 1;
        for (String str : BangunDatar.listBangunDatar) {
            System.out.printf("%d. %s\n", i, str);
            i++;
        }
        System.out.println("===================");
    }
}
