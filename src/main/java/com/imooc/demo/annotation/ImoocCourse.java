package com.imooc.demo.annotation;

@CourseInfoAnnotation(courseName = "剑指java面试", courseTag = "面试", courseProfile = "巴拉巴拉小魔仙")
public class ImoocCourse {

    @PersonInfoAnnotation(name = "tianyu", language = {"java", "go"})
    private String author;

    @CourseInfoAnnotation(courseName = "Spring源码就源码", courseTag = "实战", courseProfile = "出来吧！卡布达！", courseIndex = 24)
    public void getCourseInfo() {

    }
}
