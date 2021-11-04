package com.imooc.demo.generic;

public class RobotFactory<T,N> implements GenericIFactory<T,N>{
    @Override
    public T nextObject(N n) {
        return null;
    }

    @Override
    public N nextNumber() {
        return null;
    }
}
