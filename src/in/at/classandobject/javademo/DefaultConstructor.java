package in.at.classandobject.javademo;

public class DefaultConstructor {

    DefaultConstructor(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        DefaultConstructor object = new DefaultConstructor();

        System.out.println(object.getClass());
    }
}
