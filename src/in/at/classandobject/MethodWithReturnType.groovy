package in.at.classandobject

class MethodWithReturnType {

    static main(args){

        def m = 10

        MethodWithReturnType test = new MethodWithReturnType()
        def total = test.sumOfThreeNumbers(10, 20, 30)
        def finalValue = total * m
        println("The multiplied value1 is: " + finalValue)

        def groovyTotal = test.sumOfThreeNumbersInGroovy(10, 20, 30)
        def finalValueGroovy = groovyTotal * m
        println("The multiplied value2 is: " + finalValue)

        def  groovySimpleTotal = test.sumOfThreeNumbersInGroovySimplified(10, 20, 30)
        def finalValueGroovySimple = groovySimpleTotal * m
        println("The multiplied value3 is: " + finalValue)
    }

    public int sumOfThreeNumbers(int a, int b, int c) {
        def total = a + b + c
        return total

    }

    def sumOfThreeNumbersInGroovy(def a, def b, def c){
    def total = a + b + c
    total
    }

    def sumOfThreeNumbersInGroovySimplified(a, b, c){
        a + b + c

    }

}
