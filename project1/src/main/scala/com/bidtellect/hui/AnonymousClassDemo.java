package com.bidtellect.hui;
public class AnonymousClassDemo {
    public static void main(String[] xxx){
        AcdType obj = new AcdType(){
            public void say(){
                System.out.println("Hehe");
            }
        };
        ((Inter)obj).say();
    }
}
class AcdType{
}

interface Inter{
    void say();
}
