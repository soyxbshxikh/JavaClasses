import java.util.Scanner;

class Account {
    int accNumber;
    String accHolder;
    double balance;

    public Account(int accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    Account[] accounts;
    int totalAccounts;

    public Bank() {
        accounts = new Account[100];
        totalAccounts = 0;
    }

    public void addAccount(int accNumber, String accHolder, double balance) {
        Account newAccount = new Account(accNumber, accHolder, balance);
        accounts[totalAccounts] = newAccount;
        totalAccounts++;
        System.out.println("Account added successfully.");
    }

    public void removeAccount(int accNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].accNumber == accNumber) {
                accounts[i] = accounts[totalAccounts - 1];
                totalAccounts--;
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAllAccounts() {
        for (int i = 0; i < totalAccounts; i++) {
            accounts[i].display();
            System.out.println("----------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    bank.addAccount(accNumber, accHolder, balance);
                    break;
                case 2:
                    System.out.print("Enter Account Number to Remove: ");
                    int accNumToRemove = scanner.nextInt();
                    bank.removeAccount(accNumToRemove);
                    break;
                case 3:
                    System.out.print("Enter Account Number to Deposit: ");
                    int accNumToDeposit = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.accounts[accNumToDeposit - 1].deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter Account Number to Withdraw: ");
                    int accNumToWithdraw = scanner.nextInt();
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.accounts[accNumToWithdraw - 1].withdraw(withdrawAmount);
                    break;
                case 5:
                    bank.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
