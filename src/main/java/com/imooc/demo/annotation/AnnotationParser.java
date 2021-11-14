package com.imooc.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationParser {
    //  解析类的注解
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.imooc.demo.annotation.ImoocCourse");
        //  这里获取的是class对象的注解，而不是其里面的方法和成员变量的注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println("课程名:" + courseInfoAnnotation.courseName() + "\n" +
                    "课程标签:" + courseInfoAnnotation.courseTag() + "\n" +
                    "课程简介:" + courseInfoAnnotation.courseProfile() + "\n" +
                    "课程序号:" + courseInfoAnnotation.courseIndex());
        }
    }

    //  解析成员变量上的标签
    public static void parseFieldAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.imooc.demo.annotation.ImoocCourse");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            boolean annotationPresent = field.isAnnotationPresent(PersonInfoAnnotation.class);
            if (annotationPresent) {
                PersonInfoAnnotation personInfoAnnotation = field.getAnnotation(PersonInfoAnnotation.class);
                System.out.println("名字:" + personInfoAnnotation.name() + "\n" +
                        "性别:" + personInfoAnnotation.gender() + "\n" +
                        "年龄:" + personInfoAnnotation.age() + "\n" +
                        "开发语言:" + Arrays.toString(personInfoAnnotation.language()));
            }
        }
    }

    //  解析方法注解
    public static void parseMethodAnnotation() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.imooc.demo.annotation.ImoocCourse");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CourseInfoAnnotation.class)) {
                CourseInfoAnnotation courseInfoAnnotation = method.getAnnotation(CourseInfoAnnotation.class);
                System.out.println("课程名:" + courseInfoAnnotation.courseName() + "\n" +
                        "课程标签:" + courseInfoAnnotation.courseTag() + "\n" +
                        "课程简介:" + courseInfoAnnotation.courseProfile() + "\n" +
                        "课程序号:" + courseInfoAnnotation.courseIndex());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        parseTypeAnnotation();
        parseFieldAnnotation();
//        parseMethodAnnotation();
    }
}
