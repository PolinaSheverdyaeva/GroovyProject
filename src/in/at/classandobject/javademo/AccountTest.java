package in.at.classandobject.javademo;

import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account of Jane Green: ");
        double depositAmount = input.nextDouble(); //obtain user input

        System.out.printf("adding %.2f to account of Jane Green balance%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account of John Blue: ");
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("adding %.2f to account of John Blue balance%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }

}
