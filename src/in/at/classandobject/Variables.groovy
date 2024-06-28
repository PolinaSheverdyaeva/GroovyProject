package in.at.classandobject

class Variables {

    def instanceInt = 15

    def static staticInt = 25

    static main(args){

        Variables var = new Variables()
        var.method()

        int a1 = 10
        int b1 = 20

        //Multiple assignements
        def(a, b, c) = [10, 20, "groovy"]

        println("a value is: " + a)
        println("b value is: " + b)
        println("c value is: " + c)
    }

    def method(){
        def localInt = 10
        println("Local variable value is: " + localInt)
    }
}
