package in.at.classandobject

class MethodWithParameters {

    static main(args){

        int a = 10
        int b = 20
        int c = 30

        def d = a + b + c

        println("The sum of a, b and c is: " + d)

        def(e, f, g) = [40, 50, 60]
        def h = e + f + g

        println("The value of h is: " +  h)

        MethodWithParameters method = new MethodWithParameters()
        method.sumOfThreeNumbers(10, 20, 30)
        method.sumOfThreeNumbers(10, 50, 100)

        divideTwoNumbers(100, 2)


    }

    def sumOfThreeNumbers(def firstVaule, def secondValue, def thirdValue){
        def total = firstVaule + secondValue + thirdValue
        println("The total is: " + total)

    }

    def static divideTwoNumbers(def firstValue, def secondValue){
        def division = firstValue / secondValue
        println(division)
    }


}
