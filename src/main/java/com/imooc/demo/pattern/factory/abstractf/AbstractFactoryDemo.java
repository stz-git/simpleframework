package com.imooc.demo.pattern.factory.abstractf;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new HpComputerFactory();
        computerFactory.createMouse().sayHi();
        computerFactory.createKeyboard().sayHello();
    }
}
