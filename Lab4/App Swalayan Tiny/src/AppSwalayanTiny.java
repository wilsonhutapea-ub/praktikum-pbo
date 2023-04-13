import java.util.*;

public class AppSwalayanTiny {
    static ArrayList<Customer> CustArrLi = new ArrayList<Customer>();
    public static void main(String[] args) {

        AppSwalayanTiny.CustArrLi.add(new Customer("7412345678", "123456", "Wilson", 10000000));
        AppSwalayanTiny.CustArrLi.add(new Customer("5612345678", "123456", "Anto", 500000));
        AppSwalayanTiny.CustArrLi.add(new Customer("3812345678", "123456", "Dono", 200000));
        
        Customer.welcome();
        Customer.promptUser();

    }
}
