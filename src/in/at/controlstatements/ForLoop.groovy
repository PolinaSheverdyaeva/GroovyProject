package in.at.controlstatements

class ForLoop {

    static main(args){
        for(def i = 0; i <= 10; i++){
            println "The value og i is: " + i
        }

        println("==================================")

        def languages = ["Groovy", "Java", "Python"]
        println("-------using For loop----------------")
        for (def i = 0; i < languages.size(); i++){
            println(languages[i])
        }
        println("-------using For Each loop----------------")
        for (def language : languages){
            println(language)
        }

        //each method- closure
        println("-------using closure----------------")
        languages.eachWithIndex{ def language, index ->
            println("${index} is ${language}")}

        //each method - closure
        println("-------using closure and EACH----------------")
        languages.each{ language ->
            println(language)
        }

        println("---------using UPTO--------------")
        0.upto(10){
            println(it)
        }

        println("-------using TIMES----------------")

        10.times{
            println(it)
        }

        println("-------using FOR----------------")

        for(i in 1..10){
            println(i)
        }
        println("-------using closure and EACH2----------------")
        languages.each{
            println(it)
        }

        println("-------using foreach and closure----------------")

        (0..10).each{
            println(it)
        }

        println("-------i = i + 2 in Java----------------")

        for (def i = 0; i <= 10; i = i + 2){
            println("The Value of i is: " + i)
        }

        println("-------step in Groovy----------------")

        0.step(12,2){
            println(it)
        }



    }
}
