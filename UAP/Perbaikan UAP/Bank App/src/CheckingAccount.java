public class CheckingAccount extends Account {
    
    public static final double INTEREST_RATE = 0.005;

    public CheckingAccount(Customer cust, double initialBalance){
        super(cust, initialBalance);
        super.setMonthlyTxLimit(150);
    }

}
