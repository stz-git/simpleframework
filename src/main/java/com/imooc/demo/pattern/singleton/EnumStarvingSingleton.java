package com.imooc.demo.pattern.singleton;

import java.lang.reflect.InvocationTargetException;

public class EnumStarvingSingleton {
    private EnumStarvingSingleton() {
        if (ContainerHolder.HOLDER != null) {
            throw new RuntimeException();
        }
    }

    private enum ContainerHolder {
        HOLDER;
        private EnumStarvingSingleton instance;

        ContainerHolder() {
            instance = new EnumStarvingSingleton();
        }
    }

    public static EnumStarvingSingleton getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumStarvingSingleton instance = EnumStarvingSingleton.getInstance();
        System.out.println(instance);

        //Reflect
        Class<?> clazz = Class.forName("com.imooc.demo.pattern.singleton.EnumStarvingSingleton");
        instance = (EnumStarvingSingleton) clazz.getDeclaredConstructor().newInstance();
        System.out.println(instance);
    }
}
