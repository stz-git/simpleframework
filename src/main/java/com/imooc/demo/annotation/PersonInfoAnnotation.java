package com.imooc.demo.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Inherited
public @interface PersonInfoAnnotation {
    //  名字
    public String name();
    //  年龄
    public int age() default 19;
    //  性别
    public String gender() default "男";
    //  开发语言
    public String[] language();
}
