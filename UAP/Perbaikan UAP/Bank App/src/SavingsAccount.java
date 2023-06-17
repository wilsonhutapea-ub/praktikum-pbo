public class SavingsAccount extends Account {
    
    public static final double INTEREST_RATE = 0.02;
    
    public SavingsAccount(Customer cust, double initialBalance){
        super(cust, initialBalance);
        super.setMonthlyTxLimit(6);
    }
    

    
}
