package in.at.abstractclass

class Car extends Vehicle{

//    Car(color,speed){
//        super(color, speed)
//    }

    static main(args){

//        Car c = new Car("blue", "fast")
        Car c = new Car()
        c.seats()
        c.gears()
        c.powerWindows()
        c.wheels()


        println(c.color = "blue")
        println(c.speed = "fast")

    }

    @Override
    def gears() {
        println("Manual gear")
    }

    @Override
    def acOption() {
        println("No AC")
    }

    def powerWindows(){
        println "No power windows"
    }
}
