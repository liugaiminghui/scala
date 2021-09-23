package com.bidtellect.hui.java8interface;

public class Demo {
    public static void main( String[] xxx ){
        DummyInterface obj = new AnonSim();
        obj.say();
    }
}

interface Base { void say(); }

interface DummyInterface extends Base{
    default void say(){
        System.out.println("This is from DummyTrait!");
    }
    void eat();
}

interface DummyInterface2 extends Base{
    default void say(){

    }
}

class AcdType{}
class AnonSim extends AcdType implements DummyInterface, DummyInterface2{
    public void eat(){
        System.out.println("Implement eat!");
    }
    public void say(){}
}
