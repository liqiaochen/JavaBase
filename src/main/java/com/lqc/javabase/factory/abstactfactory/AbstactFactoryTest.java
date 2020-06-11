package com.lqc.javabase.factory.abstactfactory;


import com.lqc.javabase.factory.ICourse;

/**
 * @ClassName: AbstactFactoryTest
 * @description:  多对多
 * 抽象工厂，适用于复杂的场景，如课程有笔记，视频的内容，课程类型有Java，Python
 *
 * 规范化，同一课程的内容是相同的
 *
 * 缺点：不易扩展，一旦需要增删所有类都要改变
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:53
 * @version: 1.0
 */
public class AbstactFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.createCourse();
        course.record();
        factory.createNote();
        factory.createVideo();
    }

}
