package in.at.ooops.inheritance.singleinheritance

class AdvancedCalculator extends Calculator {

    static main(args){
        AdvancedCalculator ac = new AdvancedCalculator()

        ac.add()
        ac.substract()
        ac.divide()
        ac.multiply()

        println(ac.brand)
        println(ac.getPrice())
        println(ac.solarPowered)
    }

    def multiply(){

        println "Multiplying numbers"
    }

    def divide(){
        println "Dividing the numbers"
    }
}
