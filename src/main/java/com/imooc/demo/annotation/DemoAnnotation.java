package com.imooc.demo.annotation;

import java.lang.annotation.*;
//  目标
@Target(ElementType.METHOD)
//  保留
@Retention(RetentionPolicy.RUNTIME)
//  javaDoc
@Documented
//  可继承性:是否允许被注解修饰类的子类继承该注解
@Inherited
public @interface DemoAnnotation {

}
