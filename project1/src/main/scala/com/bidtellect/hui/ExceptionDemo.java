package com.bidtellect.hui;

public class ExceptionDemo {
    public static void main( String[] xxx){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try {
            System.out.println("Deal with it.");
            throw new MyException();
        }
        catch(Exception e){
        }
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");






    }


}

class MyException extends Exception{
}
