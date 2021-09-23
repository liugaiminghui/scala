package com.bidtellect.hui.interfaceDemo;

public class Demo {
}

interface A{
    default void method(){
        System.out.println("A");
    }
}

interface B{
    default void method(){
        System.out.println("B");
    }
}

class C implements  A, B{
    @Override
    public void method(){

    }
}