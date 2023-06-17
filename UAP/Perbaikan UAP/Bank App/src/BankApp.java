public class BankApp {
    public static void main(String[] args) throws Exception {
        
        Customer wilson = new Customer("Wilson Hutapea", "wilsonhutapea@student.ub.ac.id", "Candi Mendut No. 6");
        SavingsAccount wilsonAcc = new SavingsAccount(wilson, 100000);
        Bank.addAccount(wilsonAcc);

        Customer miguel = new Customer("Miguel O'Hara", "spidey2099@nuevayork.com", "Spiderverse HQ");
        CheckingAccount miguelAcc = new CheckingAccount(miguel, 200000);
        Bank.addAccount(miguelAcc);

        wilsonAcc.info();
        miguelAcc.info();
        
        wilsonAcc.transfer(50000, miguelAcc);
        
        wilsonAcc.info();
        miguelAcc.info();

        


    }
}
