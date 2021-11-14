package com.imooc.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldCollector {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.imooc.demo.reflect.ReflectTarget");

        System.out.println("********获取所有公有的字段(包括父类的公用字段)********");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("********获取所有字段(包括私有、受保护的、默认的，但不包括父类)********");
        fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("********获取公用字段并调用********");
        Field name = clazz.getField("name");
        Constructor<?> constructor = clazz.getConstructor();
        ReflectTarget reflectTarget = (ReflectTarget)constructor.newInstance();
        name.set(reflectTarget, "tianyu");
        System.out.println(reflectTarget.name);

        System.out.println("********获取私用字段并调用********");
        Field targetInfo = clazz.getDeclaredField("targetInfo");
        targetInfo.setAccessible(true);
        targetInfo.set(reflectTarget, "1111111");
        System.out.println(reflectTarget);
    }
}
