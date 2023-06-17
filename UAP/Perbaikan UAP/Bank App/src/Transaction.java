public class Transaction {
    private String txID;
    private double txValue;
    Account sender;
    Account recipient;
    private String txType;

    

    public Transaction(double txValue, Account sender, Account recipient, int txType){
        this.txValue = txValue;
        this.sender = sender;
        this.recipient = recipient;
        this.assignTxID();

    }

    void assignTxID(){
        if(Bank.txList.size() <= 1){
            this.txID = "337000000001";
            return;
        }
        this.txID = (String.valueOf((Integer.parseInt(Bank.txList.get(Bank.txList.size()-1).getTxID())) + 1));
    }

    void assignTxType(int txType){
        switch(txType){
            case 1 : {
                this.txType = "Deposit";
                break;
            }
            case 2 : {
                this.txType = "Withdraw";
                break;
            }
            case 3 : {
                this.txType = "Transfer";
                break;
            }
        }
    }



    public String getTxID() {
        return txID;
    }
    public void setTxID(String txID) {
        this.txID = txID;
    }
    public double getTxValue() {
        return txValue;
    }
    public void setTxValue(double txValue) {
        this.txValue = txValue;
    }
    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }
    
}
