package in.at.controlstatements

class NestedIf {

    static main(args){

        if( 1 > 0){
            println "Outer of if block"
            if(1 > 2){
                println( "1 is greater than 0 and is less than 2")
            }
        }
        println "Out of it"
    }
}
