package src.Basic_02;

public class Lab007 {

    public static void main (String [] args)
    {
        /*
        showcase difference between println & print
         */
        System.out.println("Hello world");

        int age=30;

        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        System.out.printf("Your age is %d",age);
    }
}
