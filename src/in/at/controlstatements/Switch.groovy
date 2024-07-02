package in.at.controlstatements

class Switch {

    static main(args){

        def marks = 25

        switch(marks){
            case 0..34:
                println "Failed."
                break
            case 35..60:
                println "Passed in Third Class"
                break
            case 60..75:
                println "Passed in Second Class"
                break
            default:
                println "Passed in First Class"
                break
        }
    }
}
