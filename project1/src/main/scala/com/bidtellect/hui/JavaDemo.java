package com.bidtellect.hui;

public class JavaDemo {
    public static void main(String[] xxx) {
        JavaPerson p = new JavaPerson(2);

    }

}

class JavaPerson {
    public final int age;   //声明但是没有初始化final

//    public JavaPerson(){
//        this.age = 1;
//        System.out.println("I am called!");
//    }

    public JavaPerson(int age){
        this.age= age;     //原因是构造函数中赋值了。
    }


}

class JavaStudent extends JavaPerson {
    private int no = 1;
    public JavaStudent(int no){
        super(1);
        this.no = no;

    }
    public JavaStudent(String name){
        super(1);

    }

}
