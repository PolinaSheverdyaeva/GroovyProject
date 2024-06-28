package in.at

class Lady1 extends Person {

    static main(args){
        def obj = new Person()
        obj.name = "Polina"
        obj.age = 40

        obj.sayHello()
    }

    def "test sayHello method"(){
        given:
        def obj = new Person()
        obj.name = "Polina"
        obj.age = 30

        when:
        def result = obj.sayHello()

        then:
        result == "Hello, my name is Polina and I am 30 years old"
    }
}
