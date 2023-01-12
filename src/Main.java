import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter name,password and balance to crate your acoount");

        // create user

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);

        // add amount
        String message=user.addMoney(1000000);
        System.out.println(message);

        // withdraw amount
        System.out.println("Enter the amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        // rate of Interest
        System.out.println(user.calculateInterest(10));
    }
}