package staticdemo

class StaticMethodDemo {

    def num = 10
    static staticNum = 20

    static main(args){


        println staticNum
        StaticMethodDemo object = new StaticMethodDemo()
        object.sum()
        println(object.num)

        staticSum()

    }

    def sum(){
        println(num + num)
    }

    def static staticSum(){
        println staticNum + staticNum
        //println(num + num)
    }

}
