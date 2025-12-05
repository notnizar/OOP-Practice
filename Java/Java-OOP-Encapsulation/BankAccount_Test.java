
import java.util.Scanner;

public class BankAccount_Test {

    static BankAccount nizar_Account = new BankAccount(300, 1);
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        while (true) {
            System.out.println("What You Want To Do? ");
            System.out.println("1-deposit");
            System.out.println("2-withdraw");
            System.out.println("3-account info");
            System.out.println("4-quit");
            System.out.print("Choise (1,2,3,4): ");
            int ch = input.nextInt();
            
            if (ch == 4) {
                System.out.println("Good Bye!");
                break;
            }

            switch (ch) {
                case 1 ->
                    Deposit();
                case 2 ->
                    Withdraw();
                case 3 ->
                    nizar_Account.print_info();
            }
        }

    }

    public static void Deposit() {
        System.out.print("Enter How Much You Want to Deposit: ");
        nizar_Account.deposit(input.nextInt());
    }

    public static void Withdraw() {
        System.out.print("Enter How Much You Want to Withdraw: ");
        nizar_Account.withdraw(input.nextInt());
    }
}
