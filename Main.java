import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Check balance method
    public double checkBalance() {
        return balance;
    }

    // Display account details method
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading account details and initial balance
        String accNum = scanner.next();
        String accName = scanner.next();
        double initialBalance = scanner.nextDouble();

        // Creating an object using the parameterized constructor
        BankAccount account = new BankAccount(accNum, accName, initialBalance);

        // Performing one deposit and one withdrawal operation
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Displaying the final account details
        account.displayAccount();

        scanner.close();
    }
}