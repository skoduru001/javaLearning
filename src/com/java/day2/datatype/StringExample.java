package com.java.day2.datatype;

public class StringExample {
    public static void main(String[] args){
        /*String s = "HELLO";
        s = s + "WORLD";
        String RESULT = s.substring(3);
        String SecondResult = s.substring(3,4);
        System.out.println("final = " + SecondResult);*/
        /*StringBuffer s = new StringBuffer("HELLO");
        s.append(" WORLD ");
        System.out.println("Final = " + s);*/
        StringBuilder builder = new StringBuilder ("HELLO");
        builder.append(" WORLD ");
        System.out.println("Final = " + builder);

    }
}

