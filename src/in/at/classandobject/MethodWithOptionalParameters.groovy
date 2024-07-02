package in.at.classandobject

class MethodWithOptionalParameters {

    static main(args){
        MethodWithOptionalParameters mwop = new MethodWithOptionalParameters()
        mwop.addThreeNumbers(10, 20)
    }

    def addThreeNumbers(def firstValue, def secondValue, def thirdValue = 30){
        def total = firstValue + secondValue + thirdValue
        println("The total value is: " + total)
    }


}
