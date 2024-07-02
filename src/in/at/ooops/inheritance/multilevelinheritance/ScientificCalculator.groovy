package in.at.ooops.inheritance.multilevelinheritance

class ScientificCalculator extends AdvancedCalculator{

    static main(args){

        ScientificCalculator sc = new ScientificCalculator()

        sc.solarPowered
        sc.brand
        sc.getPrice()

        sc.add()
        sc.substract()
        sc.multiply()
        sc.divide()
        sc.calculus()
        sc.statistics()

    }

    def calculus(){

        println("Calculus functions")
    }

    def statistics(){
        println("Statistics functions")
    }
}
