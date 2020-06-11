package com.lqc.javabase.factory.abstactfactory;


import com.lqc.javabase.factory.ICourse;
import com.lqc.javabase.factory.PythonCourse;

/**
 * @ClassName: PythonCourseFactory
 * @description: TODO
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:56
 * @version: 1.0
 */
public class PythonCourseFactory  implements  ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
