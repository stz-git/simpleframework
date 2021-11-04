package com.imooc.demo.generic;

/**
 * 泛型类
 * @param <T>
 */
public class GenericClassExample<T> {
    private T member;

    public T handleSomething(T target) {
        return target;
    }

    /**
     * 泛型方法
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArray(E[] inputArray) {

    }
}
