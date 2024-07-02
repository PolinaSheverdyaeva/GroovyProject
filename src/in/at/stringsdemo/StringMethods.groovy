package in.at.stringsdemo

class StringMethods {

    static main(args){

        def s = "Groovy"
        def s1 = s.concat(" Program")

        def s2 = "Groovy Program"

        def str5 = "        Groovy Program"


        println(s1)

        println("The length of the s1 is: " + s1.length())
        println("The character at a position 5 is: " + s1.charAt(5))
        println("The Contains Value 'java' is: " + s1.contains("java"))
        println("The Contains Value 'groo' is: " + s1.contains("groo"))
        println("The Contains Value is with case insensitive 'groo': " + s1.toLowerCase().contains("groo"))
        println("Check if it starts with 'groo' with case insensitive " + s1.toLowerCase().startsWith("groo"))
        println("Check if it starts with \"groo\" ${s1.startsWith("groo")}")
        println('Check if it starts with "groo" ' + s1.startsWith("groo"))

        println("Check if it starts with \"groo\" with case insensitive ${s1.toLowerCase().startsWith("groo")}")
        println('Check if it starts with "groo" with case insensitive' + s1.toLowerCase().startsWith("groo"))

        println("Check if it ends with \"gram\" case insensitive: " + s1.toLowerCase().endsWith("gram"))
        println("Are two strings Equsl? " + s2.equals(s1))

        println("The index of 'y' is: " + s1.indexOf('y'))

        println("Is the string empty: " + s1.isEmpty())
        def s4 = ""
        println("Is the string empty: " + s4.isEmpty())

        println("The Replace Method: " + s1.replace("Groovy", "Java"))

        println("The Substring method: " + s1.substring(0, 6))

        println("Replace with substring: " +s1.replace(s1[0..5], "Java"))
        println("Lover case: " + s1.toLowerCase())
        println("Upper case: " + s1.toUpperCase())
        println("Trim demo: " + str5.trim())

        println("The split: " + s1.split(" ")[0])
        println("The split: " + s1.split(" ")[1])

        //created array with values
        def spl = s1.split(" ")
        println("Using length - 1: " + spl[spl.length - 1])

        println("The split: " + s1.split("v")[1])

        def str6 = "GROOVY"
        def str7 = "groovy"

        println("Equals Ignore Case: " + str6.equalsIgnoreCase(str7))
    }
}
