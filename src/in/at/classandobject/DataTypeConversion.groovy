package in.at.classandobject

class DataTypeConversion {

    static main(args){

        char charValue1 = 65
        def charValue = 65 as char
        def strNumber = "100" as int
        int a = strNumber + 10

        def doubleValue = 10.125417643872647264 as float
        println(doubleValue)

        println(charValue)
        println(charValue1)
        println(strNumber)
        println(a)
    }
}
