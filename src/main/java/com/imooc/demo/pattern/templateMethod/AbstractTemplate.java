package com.imooc.demo.pattern.templateMethod;

/**
 * 模板方法模式
 */
public abstract class AbstractTemplate {
    //模板结构
    public void templateMethod() {
        concurrentMethod();
        hookMethod();
        abstractMethod();
    }

    //具体方法
    public void concurrentMethod() {
        System.out.println("模板里自带的实现方法，万年不变");
    }

    //钩子方法，子类可以依据情况实现的方法
    protected void hookMethod(){};

    //抽象方法，子类必须实现的方法
    public abstract void abstractMethod();
}
