package example;

import org.joda.time.DateTime;

public class HelloWorld {
 
    public static void main(String[] args) {
        System.out.println("Hello World!");
        java.util.Date juDate = new java.util.Date();
        DateTime dt = new DateTime(juDate);
    }
}
