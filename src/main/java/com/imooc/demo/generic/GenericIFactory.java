package com.imooc.demo.generic;

/**
 * 泛型接口
 * @param <T>
 * @param <N>
 */
public interface GenericIFactory<T, N> {
    public T nextObject(N n);
    public N nextNumber();
}
