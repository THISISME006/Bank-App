import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String names,accountNO,password;
     private double balance;
     private static double rateOfInterest;

    public SBIUser(String names,double balance, String password) {
        this.names = names;
        this.password = password;
        this.balance = balance;

        // bank is initializing

        this.rateOfInterest=6.5;
        this.accountNO= String.valueOf(UUID.randomUUID());
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {

        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Updated balance"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String Enteredpassword) {
        if(Objects.equals(Enteredpassword,password)){
            if(amount>balance){
                return "Insufficient balance";
            }
            else{
                balance-=amount;
                return "Here's your money!!!";
            }
        }
        else{
            return "Wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {

        return (balance*years*rateOfInterest)/100;
    }
}
