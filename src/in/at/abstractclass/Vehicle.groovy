package in.at.abstractclass

abstract class Vehicle {

    def color
    def speed

//    Vehicle(color, speed){
//        this.color = color
//        this.speed = speed
//    }

    def seats(){
        println "5 seat vehicle"
    }

    def wheels(){
        println("4 wheels vehicle")
    }

    abstract def gears()

    abstract def acOption()
}
