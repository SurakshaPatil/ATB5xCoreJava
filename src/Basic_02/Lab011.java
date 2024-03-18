package src.Basic_02;

public class Lab011 {

    public static void main(String []args){
     char c='A';
        System.out.println(c);

        //char c1="$"; //only string value can be write in double quote
        char c1='$';
        System.out.println(c1);

        char c2='\n';
        System.out.println(c2);

        char c3='\u1F60'; // Unicode -> :) :( , :| -> they created with unicode char
        System.out.println(c3);
        // ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
//        // 0-9 48-57

        int age=10;    //decimal
        int b=0101;    //octal
        int b2= 0b101;  //binary
        int c4=0Xface;  //hex

        System.out.println(age);
        System.out.println(b);
        System.out.println(b2);
        System.out.println(c4);
    }}
