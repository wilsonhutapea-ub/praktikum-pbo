import java.io.IOException;
import java.util.*;

public class Customer {
    
    // required for transaction or topup
    private String custID;
    private String pin;

    private String name;
    private double balance;
    private String custType; // first 2 digits from customer ID
    private String custTypeStr; // customer type in String
    private double cashback; // cashback notated in double.  0.02 = 2%
    private double cashbackOverOneMio; // cashback if transaction is over IDR 1 mio
    private String cashbackStr; // cashback percentage in String
    private String cashbackOverOneMioStr;
    final private int MINBALANCE = 10000; // min balance cannot be changed
    private boolean accIsFrozen;
    
    Customer(String custID, String pin, String name, double balance){
        this.custType = custID.substring(0, 2);
        this.custID = custID;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
        switch(custType){
            case "38": {
                this.custTypeStr = "Silver";
                this.cashbackOverOneMio = 0.05;
                this.cashbackOverOneMioStr = "5%";
                break;
            }
            case "56": {
                this.custTypeStr = "Gold";
                this.cashbackOverOneMio = 0.07;
                this.cashbackOverOneMioStr = "7%";
                this.cashback = 0.02;
                this.cashbackStr = "2%";
                break;
            }   
            case "74": {
                this.custTypeStr = "Platinum";
                this.cashbackOverOneMio = 0.1;
                this.cashbackOverOneMioStr = "10%";
                this.cashback = 0.05;
                this.cashbackStr = "5%";
                break;
            }
        }
    }
    
    void display(){
        System.out.println("-- Customer Information --");
        System.out.println("Customer name: " + name);
        System.out.println("Customer ID: " + custID);
        System.out.println("Balance: " + formatIDR(balance));
        System.out.println("Customer type: " + custTypeStr);
        System.out.println("Account status: " + (accIsFrozen?"Frozen":"Not frozen"));
        System.out.println("");
    }
    
    void topUp(){
        System.out.println("Initiate topup procedure...\n");
        System.out.println("Current balance: " + formatIDR(balance));
        System.out.println("Please input topup amount:");
        int amt = Integer.parseInt(getUserInput());
        authenticatePin();
        if(accIsFrozen) return;
        balance += amt;
        System.out.println("Topup successful. Top up value: " + formatIDR(amt));
        System.out.printf("Current balance: %s\n\n", formatIDR(balance));        
    }
    
    void purchase(){
        System.out.println("Initiate purchase procedure...\n");
        System.out.println("Current balance: " + formatIDR(balance));
        System.out.println("Please input purchase amount:");
        int amt = Integer.parseInt(getUserInput());
        authenticatePin();
        if(accIsFrozen) return;
        while(balance - amt <= MINBALANCE){
            System.out.println("Insufficient balance.");
            amt = Integer.parseInt(getUserInput());
        }
        double cashbackAmt; 
        if(amt > 1000000){
            cashbackAmt = amt * cashbackOverOneMio;
        } else {
            cashbackAmt = amt * cashback;
        }
        balance -= amt - cashbackAmt; // deducts (amt - cashback) from balance
        System.out.println("Purchase successful. Deducted from balance: " + formatIDR(amt));
        System.out.printf("You got %s cashback!\n", (amt>1000000?(cashbackOverOneMioStr):(cashbackStr)));
        System.out.println(formatIDR(cashbackAmt) + " has been returned to your account.");
        System.out.printf("Current balance: %s\n\n", formatIDR(balance));
        
    }

    boolean checkIfAccountIsFrozen(){
        if(accIsFrozen){
            System.out.println("Sorry. Your account is blocked. Please contact customer support.");
            return true;
        } else {
            return false;
        }
    }

    String formatIDR(double a){
        Formatter formatter = new Formatter();
        formatter.format("IDR%, d", (int)a);
        return formatter.toString();        
    }

    static int authenticate(){
        boolean cont = true;
        while(cont){
            boolean accBlock = false;
            System.out.println("\nPlease input your customer ID:");
            String customerID = getUserInput();
            for(int i = 0; i < AppSwalayanTiny.CustArrLi.size(); i++){
                if(AppSwalayanTiny.CustArrLi.get(i).getCustID().equals(customerID)){
                    if(AppSwalayanTiny.CustArrLi.get(i).checkIfAccountIsFrozen()){
                        return -1; // if acc is frozen, return -1
                    }
                    for(int j = 3; j > 0; j--){
                        System.out.println("Please input your password:");
                        String pwd = getUserInput();
                        if(pwd.equals(AppSwalayanTiny.CustArrLi.get(i).getPin())){
                            return i;
                        }
                        if(j > 1){
                            System.out.printf("Wrong password. %d attempts left.\n", j-1);
                        }
                    }
                    AppSwalayanTiny.CustArrLi.get(i).setIsFrozen(true);
                    accBlock = true;
                    System.out.println("You have run out of attempts. Your account is blocked. Please contact our customer support.");
                    break;
                }
            }
            if(accBlock == false){
                System.out.println("Customer ID not found. Please try again.\n");
            }
        }
        return -1;
    }

    void authenticatePin(){
        boolean cont = true;
        while(cont){
            boolean accBlock = false;
                for(int j = 3; j > 0; j--){
                    System.out.println("Please input your password:");
                    String pwd = getUserInput();
                    if(pwd.equals(pin)){
                        return;
                    }
                    if(j > 1){
                        System.out.printf("Wrong password. %d attempts left.\n", j-1);
                    }
                }
                setIsFrozen(true);
                System.out.println("You have run out of attempts. Your account is blocked. Please contact our customer support.");
                break;
        }
        accIsFrozen = true;
    }

    static void promptUser(){
        boolean cont = true;
        int v = 1;
        while(cont){
            v = Customer.authenticate(); // v represents the index of current customer in the CustArrLi ArrayList
            if(v < 0){
                continue;
            }
            boolean exit = false;
            while(cont){
                if(AppSwalayanTiny.CustArrLi.get(v).getIsFrozen()){
                    break;
                } else if(exit){
                    break;
                }
                if(v >= 0 && v <= AppSwalayanTiny.CustArrLi.size()){
                    System.out.println("Please choose an activity:");
                    System.out.println("1. Top up");
                    System.out.println("2. Purchase");
                    System.out.println("3. Show account information");
                    System.out.println("4. Exit");
                    int z = Integer.parseInt(getUserInput());
                    switch(z){
                        case 1: {
                            AppSwalayanTiny.CustArrLi.get(v).topUp();
                            break;
                        } 
                        case 2: {
                            AppSwalayanTiny.CustArrLi.get(v).purchase();
                            break;
                        } 
                        case 3: {
                            AppSwalayanTiny.CustArrLi.get(v).display();
                            break;
                        } 
                        default: {
                            // System.out.println("Thank you for using Swalayan App.");
                            // System.out.println("Have a nice day.");
                            exit = true;
                            clearTerminal();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }

    static void welcome(){
        System.out.println(
                ". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\n" +
                ". x x x x x x x x x x x x x x x x x x x x x x x x x x x x .\n" +
                ". x O O                                             O O x .\n" +
                ". x O                   Welcome to                    O x .\n" +
                ". x O                ~ SWALAYAN APP ~                 O x .\n" +
                ". x O                by Swalayan Tiny                 O x .\n" +
                ". x O O                                             O O x .\n" +
                ". x x x x x x x x x x x x x x x x x x x x x x x x x x x x .\n" +
                ". . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\n");
    }

    public static void clearTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error when clearing terminal..");
        }
    }

    static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String str = sc.nextLine();
        System.out.println();
        return str;
    }

    String getCustTypeStr(){
        return custTypeStr;
    }

    String getName(){
        return name;
    }

    String getPin(){
        return pin;
    }
    
    String getCustID(){
        return custID;
    }

    void setIsFrozen(boolean accIsFrozen){
        this.accIsFrozen = accIsFrozen;
    }

    boolean getIsFrozen(){
        return accIsFrozen;
    }
}