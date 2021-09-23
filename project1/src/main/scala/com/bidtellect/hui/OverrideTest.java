package com.bidtellect.hui;

import java.lang.reflect.Array;

public class OverrideTest {
    public static void main(String[] xxx){
        Super obj = new Sub();
        obj.f();
        System.out.println("Which data was inferred?" + obj.data);

    }
}


class Super{
    int data = 10;
    void f(){
        System.out.println("Super's f return "+data );
    }

}


class Sub extends Super{
    int data = 20;
    void f(){
        System.out.println("Sub's f return "+data);
    }
}