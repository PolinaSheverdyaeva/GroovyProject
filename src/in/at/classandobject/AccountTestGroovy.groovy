package in.at.classandobject

class AccountTestGroovy {

    static main(args){

        AccountGroovy account1 = new AccountGroovy("Jane Green", 50.00)
        AccountGroovy account2 = new AccountGroovy("John Blue", -7.00)

        printf("%s balance: \$%.2f%n", account1.name, account1.balance)
        printf("%s balance: \$%.2f%n", account2.name, account2.balance)

        Scanner input = new Scanner(System.in)

        println "Enter deposit amount for account of Jane Green: "
        def depositAmount = input.nextDouble(); //obtain user input

        printf("adding %.2f to account of Jane Green balance%n", depositAmount)
        account1.deposit(depositAmount);

        printf("%s balance: \$%.2f%n", account1.name, account1.balance)
        printf("%s balance: \$%.2f%n", account2.name, account2.balance)

        println("Enter deposit amount for account of John Blue: ")
        depositAmount = input.nextDouble(); //obtain user input
        printf("adding %.2f to account of John Blue balance%n", depositAmount)
        account2.deposit(depositAmount)

        printf("%s balance: \$%.2f%n", account1.name, account1.balance);
        printf("%s balance: \$%.2f%n", account2.name, account2.balance);
    }
}
