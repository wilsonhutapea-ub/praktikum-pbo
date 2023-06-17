public abstract class Account {
    private String accountID;
    private Customer accountHolder;
    private int monthlyTxLimit;
    private double balance;
    public double INTEREST_RATE;
    public static long accountNumMaker = 44210001;
    
    public Account(Customer customer, double initialBalance){
        this.assignAccountID();
        this.accountHolder = customer;
        this.balance = initialBalance;
        Account.accountNumMaker++;
    }

    public void info(){
        System.out.printf("Account ID\t: %s\nAccount Holder\t: %s\nBalance\t\t: Rp %,.2f\nInterest Rate\t: %.2f %%\n\n", this.accountID, this.accountHolder.getName(), this.balance, (this.getINTEREST_RATE()*100));
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        this.balance -= amount;
    }

    void transfer(double amount, Account recipient){
        try{
            this.balance -= amount;
            recipient.setBalance(recipient.getBalance() + amount);
        } catch (Exception e){
            System.out.println("Insufficient Balance!");
        }
    }

    void assignAccountID(){
        this.accountID = (String.valueOf(Account.accountNumMaker));
    }

    public double getINTEREST_RATE() {
        if(this instanceof SavingsAccount){
            return SavingsAccount.INTEREST_RATE;
        } else if(this instanceof CheckingAccount){
            return CheckingAccount.INTEREST_RATE;
        } else {
            return 4203435;
        }
    }
    public void setINTEREST_RATE(double iNTEREST_RATE) {
        INTEREST_RATE = iNTEREST_RATE;
    }
    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public Customer getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getMonthlyTxLimit() {
        return monthlyTxLimit;
    }
    public void setMonthlyTxLimit(int monthlyTxLimit) {
        this.monthlyTxLimit = monthlyTxLimit;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
