package in.at.inteface

class Car implements Vehicle{

    static main(args){
        Car c = new Car()
        c.wheels()
        c.gears()
        c.seats()

    }
    @Override
    def seats() {
        println("6 seats")
    }

    @Override
    def wheels() {
        println("4 wheels")
    }

    @Override
    def gears() {
        println("manual")
    }
}
