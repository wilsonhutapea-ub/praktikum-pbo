import java.util.ArrayList;

public class Bank {
    public static ArrayList<Account> accountList = new ArrayList<Account>();
    public static ArrayList<Transaction> txList = new ArrayList<Transaction>();

    public static void addAccount(Account acc){
        Bank.accountList.add(acc);
    }

    public static void removeAccount(Account acc){
        Bank.accountList.remove(acc);
    }

    public static Account getAccount(int index){
        return Bank.accountList.get(index);
    }

    public static ArrayList<Account> getAllAccounts(){
        return Bank.accountList;
    }
}
