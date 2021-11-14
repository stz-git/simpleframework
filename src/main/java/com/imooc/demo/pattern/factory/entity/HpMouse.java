package com.imooc.demo.pattern.factory.entity;

import com.imooc.demo.annotation.DemoAnnotation;

public class HpMouse implements Mouse{
    @DemoAnnotation
    @Override
    public void sayHi() {
        System.out.println("I'm hp mouse");
    }
}
