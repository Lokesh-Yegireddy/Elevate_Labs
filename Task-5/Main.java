import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        boolean running = true;

        while (running) {
            System.out.println("\n\t\t==================================================");
            System.out.println("\t\t\t Welcome TO Bank Account Simulator\t");
            System.out.println("\t\t==================================================");
            System.out.println("What would you like to do today?");
            System.out.println(" 1. Deposit Money\n" +
                    "2. Withdraw Money\n" +
                    "3. Check Balance\n" +
                    "4. Show Transaction History\n" +
                    "5. Exit");
            System.out.print("Choose Your Option (1,2,3,4,5): ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    account.deposit(depAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmt = sc.nextDouble();
                    account.withdraw(withAmt);
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    account.showTransactions();
                    break;

                case 5:
                    System.out.println("\t\t============================================================");
                    System.out.println("\t\tThank You For Using Bank Account Simulator!");
                    System.out.println("\t\t============================================================");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option, please try again!");
            }
        }
        sc.close();
    }
}
