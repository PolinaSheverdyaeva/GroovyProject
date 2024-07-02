package in.at.overriding

class ChildClass extends  ParentClass{

        static main(args){
            ChildClass child = new ChildClass()
//            child.sum(2, 3)
            child.sum(2, 3)
        }

    @Override
    def sum(int a, int b){
        println("I am in the Child's method")
        println(a + b)
    }

//        @Override
//        def sum(String a, b){
//        println("I am in the Child's method")
//        println(a + b)
//    }


}
