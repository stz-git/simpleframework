package com.imooc.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorCollector {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.imooc.demo.reflect.ReflectTarget");

        System.out.println("********所有的公用构造方法********");
        Constructor<?>[] conArray = clazz.getConstructors();
        for (Constructor<?> constructor : conArray) {
            System.out.println(constructor);
        }

        System.out.println("********所有的构造方法(包括：私有、受保护、默认、公用)********");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : conArray) {
            System.out.println(constructor);
        }

        System.out.println("********获取单个带参数的公用构造方法********");
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        System.out.println("********获取私用构造方法********");
        constructor = clazz.getDeclaredConstructor(int.class);
        System.out.println(constructor);

        System.out.println("********调用私有构造方法创建实例********");
        constructor.setAccessible(true);
        ReflectTarget reflectTarget = (ReflectTarget) constructor.newInstance(1);
        System.out.println(reflectTarget);
    }
}
