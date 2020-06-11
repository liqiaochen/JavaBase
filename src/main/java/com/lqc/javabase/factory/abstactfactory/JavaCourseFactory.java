package com.lqc.javabase.factory.abstactfactory;


import com.lqc.javabase.factory.ICourse;
import com.lqc.javabase.factory.JavaCourse;
import com.lqc.javabase.factory.simplefactory.CourseFactory;

/**
 * @ClassName: JavaCourseFactory
 * @description: Java课程工厂
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:48
 * @version: 1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
