package in.at.classandobject

class SimpleMethod {

    static main(args) {
        SimpleMethod object = new SimpleMethod()
        object.simpleMethod()
        object.simpleMethod()
        object.simpleMethod()
        object.simpleMethod()
        object.simpleMethod()

    }

    def simpleMethod(){
        int a = 10
        int b = 20
        int c = a + b
        print("The sum of a and b: " + c)

    }
}
