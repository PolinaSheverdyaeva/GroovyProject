package in.at.controlstatements

class Break {

    static main(args){

        for(def i in 1..10){
            if(i == 5)
                break
            println(i)
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break  // Exits the loop when i is 5
            }
            println "For loop i: $i"
        }

        int i = 0
        while (i < 10) {
            if (i == 5) {
                break  // Exits the loop when i is 5
            }
            println "While loop i: $i"
            i++
        }

    }
}
