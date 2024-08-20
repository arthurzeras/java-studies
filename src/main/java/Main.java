import entities.Account;
import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Locale.setDefault(Locale.US);
//        double toPay = CurrencyConverter.convertDollar(3.10, 200);
//        System.out.printf("Pagamento em reais: %.2f", toPay);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there a initial deposit? (y/N) ");
        char hasInitialDeposit = sc.next().charAt(0);

        double initialDeposit = 0.0;
        if (hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        Account account = new Account(accountNumber, accountHolder, initialDeposit);
        System.out.printf("Account data: \n%s\n", account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.printf("Updated account data: \n%s\n", account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        try {
            account.withdraw(withdraw);
            System.out.printf("Updated account data: \n%s", account);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
