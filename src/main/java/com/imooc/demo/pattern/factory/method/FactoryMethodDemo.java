package com.imooc.demo.pattern.factory.method;

import com.imooc.demo.pattern.factory.entity.DellMouse;
import com.imooc.demo.pattern.factory.entity.Mouse;

/**
 * 设计模式-工厂方法模式
 *
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse mouse = dellMouseFactory.createMouse();
        mouse.sayHi();
        
        Mouse dellMouse = new DellMouse();
        dellMouse.sayHi();
    }
}
