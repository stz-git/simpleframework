package com.imooc.demo.pattern.templateMethod;

public class ATemplate extends AbstractTemplate{

    @Override
    public void abstractMethod() {
        System.out.println("A特有的实现方法");
    }

    @Override
    public void hookMethod() {
        System.out.println("A主动上钩的实现方法");
    }

    public static void main(String[] args) {
        AbstractTemplate template = new ATemplate();
        template.templateMethod();
    }
}
