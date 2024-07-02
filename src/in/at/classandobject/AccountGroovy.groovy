package in.at.classandobject

class AccountGroovy {

    def name
    def balance

    AccountGroovy(def name, def balance){
        this.name = name
        this.balance = balance

        if(balance < 0.0){
            printf("WARNING: %s, your account with negative balance!!!!%n%n", name)
        }
    }

    def deposit(def depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount
        }
    }


}
