package com.imooc.demo.pattern.singleton;

import java.lang.reflect.InvocationTargetException;

public class StarvingSingleton {
    private static final StarvingSingleton starvingSingleton = new StarvingSingleton();
    private StarvingSingleton(){
        if (starvingSingleton != null) {
            throw new RuntimeException();
        }
    }
    public static StarvingSingleton getInstance() {
        return starvingSingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println(StarvingSingleton.getInstance());

        Class<?> clazz = Class.forName("com.imooc.demo.pattern.singleton.StarvingSingleton");
        StarvingSingleton starvingSingleton = (StarvingSingleton)clazz.getDeclaredConstructor().newInstance();
        System.out.println(starvingSingleton);
    }
}
