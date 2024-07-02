package in.at.classandobject.javademo;

public class StaticClass {

    int num = 10;
    static int staticNum = 20;
    public static void main(String[] args) {
        System.out.println(staticNum);
        StaticClass object = new StaticClass();
        staticSum();
        object.sum();
    }

    public void sum(){
        System.out.println(num + num);
    }

    static void staticSum(){
        //System.out.println(num + num);
        System.out.println(staticNum + staticNum);
    }
}
