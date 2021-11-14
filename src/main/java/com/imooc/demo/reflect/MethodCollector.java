package com.imooc.demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 获取成员方法并调用：
 *
 * 1.批量的：
 *      public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
 *      public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
 * 2.获取单个的：
 *      public Method getMethod(String name,Class<?>... parameterTypes):
 *                  参数：
 *                      name : 方法名；
 *                      Class ... : 形参的Class类型对象
 *      public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 *
 *   调用方法：
 *      Method --> public Object invoke(Object obj,Object... args):
 *                  参数说明：
 *                  obj : 要调用方法的对象；
 *                  args:调用方式时所传递的实参；
):
 */
public class MethodCollector {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.imooc.demo.reflect.ReflectTarget");

        System.out.println("***************获取所有的public方法，包括父类和Object*******************");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("***************获取所有的方法，包括私有的*******************");
        methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("***************获取公有的show1()方法*******************");
        Method show1 = clazz.getMethod("show1", String.class);
        ReflectTarget reflectTarget = (ReflectTarget) clazz.getConstructor().newInstance();
        Object ret = show1.invoke(reflectTarget, "123");
        System.out.println(ret);

        System.out.println("***************获取私有的show4()方法******************");
        Method show4 = clazz.getDeclaredMethod("show4", int.class);
        show4.setAccessible(true);
        ret = show4.invoke(reflectTarget, 1);
        System.out.println(ret);
    }
}
