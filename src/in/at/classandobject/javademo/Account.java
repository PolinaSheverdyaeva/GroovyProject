package in.at.classandobject.javademo;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){

        this.name = name;
        this.balance = balance;

//        if (balance > 0.0){
//            this.balance = balance;
//        }

        if(balance < 0.0){
            System.out.printf("WARNING: %s, your account with negative balance!!!!%n%n", name);
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
//        else {
//            System.out.printf("%n%s, please contact bank, the operation cannot be actioned at this time", name);
//        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
