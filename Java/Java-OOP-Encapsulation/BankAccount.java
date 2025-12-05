
public class BankAccount {
    private double balance;
    private double accountNumber;

    public BankAccount() {
    }

    public BankAccount(double balance, double accountnumber) {
        this.balance = balance;
        this.accountNumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountNumber = accountnumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", accountnumber=" + accountNumber + '}';
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Your " + amount + " Has Been Deposit");
        }else{
            System.out.println("Inviled Depoist Amount");
        }
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println("You Have withdraw "+ amount);
        }else{
            System.out.println("Inviled withdraw amount cheak  your account");
        }
    }
    
    public void print_info(){
        System.out.println("Your Current Balnce is: " + balance);
        System.out.println("Your Account Number is : "+ accountNumber);
    }
    
}
