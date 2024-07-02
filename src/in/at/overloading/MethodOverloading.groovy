package in.at.overloading

class MethodOverloading {

    static main(args){
        MethodOverloading mo = new MethodOverloading()

        mo.add(2, 3)
        mo.add(2, 3, 5)
        mo.add(5)

        mo.add("Polina" + " is" + " AQA")
        mo.add("Polina", " is", " AQA")
    }

    def add(int a, int b){
        println(a + b)
    }

    def add(String a, String b){
        println(a + b)
    }

    def add(a, b, c){
        println(a + b + c)
    }

    def add(a){
        println(a + a + a)
    }
}
