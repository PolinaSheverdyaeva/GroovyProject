package in.at.controlstatements

class SwitchWithClosures {

    static main(args){

        def marks = 25

        switch (marks){
            case{marks < 35}:
                println "Failed"
                break
            case{marks > 35 && marks < 60}:
                println "Passed in Third Class"
                break
            case{marks > 60 && marks < 75}:
                println "Passed in Second Class"
                break
            default:
                println "Passed in First Class"
                break
        }
    }
}
