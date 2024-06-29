package in.at.classandobject

class ArraysDemo {

    static main(args){


        def languages = new String[4]

        languages[0] = "Groovy"
        languages[1] = "Java"
        languages[2] = "Python"

        languages.putAt(3,"JavaScript")
        println languages

        println "The legth of array: " + languages.length
        println "The size of array: " + languages.size()

        println languages[0].length()

        for (def i = 0; i < languages[0].length(); i++){
            println languages[0].charAt(i)
        }

        def arrayAfterRemovalOfPython = languages - "Python"
        println(arrayAfterRemovalOfPython)
    }
}
