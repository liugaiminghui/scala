package com.bidtellect.hui.dynamicmixinjava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] xxx) {
        AcdType obj = new AcdType() {
            public void say() {
                System.out.println("Hehe");
            }
        };

        Class clazz = obj.getClass();
        Method m = reflMethod1(clazz);

        try {
            m.invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Method reflMethod1(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        if (methods != null && methods.length != 0)
            return methods[0];
        else return null;
    }
}
class AcdType {
}