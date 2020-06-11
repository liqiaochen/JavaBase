package com.lqc.javabase.factory.factorymethod;


import com.lqc.javabase.factory.ICourse;
import com.lqc.javabase.factory.JavaCourse;

/**
 * @ClassName: JavaCourseFactory
 * @description: Java课程工厂
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:17
 * @version: 1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    /**
     * 创建Java课程
     * @return
     */
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
