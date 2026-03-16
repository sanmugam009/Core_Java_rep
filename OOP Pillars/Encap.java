import java.util.Scanner;
class BankAccount {

    // private variable (data hiding)
    private double balance;

    // setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // getter method
    public double getBalance() {
        return balance;
    }
}

public class Encap{
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        System.out.println("Entering deposit amount...");
        Scanner scanner = new Scanner(System.in);
        double amount1 = scanner.nextDouble();

        account.deposit(amount1);

        System.out.println("Balance: " + account.getBalance());
        scanner.close();
    }
}