package in.at.classandobject

class Laptop {

    def price
    //def brand
    def isScreenWorkingCondition
    static  main(args)
    {
        Laptop lenovo = new Laptop()
        lenovo.logIn()
        lenovo.logOut()
        lenovo.price = 1000
        //laptop.brand="lenovo"
        lenovo.isScreenWorkingCondition = true

        println(lenovo.price)
        //println(lenovo.brand)
        println(lenovo.isScreenWorkingCondition)

        Laptop apple = new Laptop()
        apple.logIn()
        apple.logOut()

        apple.price = 50000
        apple.isScreenWorkingCondition = true
        println(apple.price)
        //println(apple.brand)
        println(apple.isScreenWorkingCondition)
    }

    def logIn()
    {
        println("System Logging In")
    }

    def logOut()
    {
        print("System Logging Out")
    }
}
