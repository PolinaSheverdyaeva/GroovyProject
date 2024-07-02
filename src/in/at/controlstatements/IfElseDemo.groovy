package in.at.controlstatements

class IfElseDemo {

    static main(args){

        def marks = 25
        if(marks < 35){
            println "Failed"
        } else if(marks > 35 && marks < 60){
            println "Passed in Third Class"
        } else if(marks > 60 && marks < 75){
            println "Passed in Second Class"
        } else {
            println "Passed in First Class"
        }
    }
}
