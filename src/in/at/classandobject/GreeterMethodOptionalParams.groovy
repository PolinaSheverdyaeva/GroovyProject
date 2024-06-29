package in.at.classandobject

class GreeterMethodOptionalParams {

    static main(args) {
        GreeterMethodOptionalParams grt = new GreeterMethodOptionalParams()
        grt.greet()
        grt.greet("Alice")
        grt.greet("Alice", "Hi")


    }

    void greet(String name = "World", String greeting = "Hello"){
        println("${greeting}, ${name}!")
    }
}