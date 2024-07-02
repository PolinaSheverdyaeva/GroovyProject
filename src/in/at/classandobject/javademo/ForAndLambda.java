package in.at.classandobject.javademo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ForAndLambda {

        public static void main(String[] args) {
            // For loop
            for (int i = 0; i <= 10; i++) {
                System.out.println("The value of i is: " + i);
            }

            System.out.println("==================================");

            // List of languages
            List<String> languages = new ArrayList<>();
            languages.add("Groovy");
            languages.add("Java");
            languages.add("Python");

            // For loop to iterate through the list using index
            for (int i = 0; i < languages.size(); i++) {
                System.out.println(languages.get(i));
            }

            // For-each loop to iterate through the list
            for (String language : languages) {
                System.out.println(language);
            }

            // Using forEach with a lambda expression
            languages.forEach(language -> {
                System.out.println(language);
            });

            // Using forEach with index
            for (int i = 0; i < languages.size(); i++) {
                System.out.println(i + " is " + languages.get(i));
            }

            // Array of languages
            String[] languages2 = {"Groovy", "Java", "Python"};

            // For loop to iterate through the array using index
            for (int i = 0; i < languages2.length; i++) {
                System.out.println(languages2[i]);
            }

            // Using IntStream to iterate from 0 to 10
            IntStream.rangeClosed(0, 10).forEach(i -> System.out.println(i));


            for (int i = 0; i <= 10; i = i + 2){
                System.out.println("The Value of i is: " + i);
            }
        }


}
