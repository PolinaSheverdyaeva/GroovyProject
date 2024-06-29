package in.at.classandobject.javademo;

import java.util.Arrays;

public class ArrayJavaDemo {

    public static void main(String[] args) {
        String[] languages = new String[3];
        languages[0] = "Java";
        languages[1] = "Groovy";
        languages[2] = "Python";

        System.out.println(Arrays.toString(languages));
        System.out.println(languages);

        int [] arr = {2, 4, 6, 8};
        System.out.println(arr);
    }
}
