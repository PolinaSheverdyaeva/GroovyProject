package in.at.ooops.inheritance.singleinheritance

class Calculator {

    def brand = "Casio"
    def solarPowered = "true"
    private price = 100

    def add(){
        println "Adding the number"
    }

    def substract(){
        println "Subtracting the number"    }

    def getPrice() {
        return price
    }
}
