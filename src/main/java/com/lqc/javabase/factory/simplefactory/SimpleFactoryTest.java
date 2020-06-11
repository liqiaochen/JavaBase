package com.lqc.javabase.factory.simplefactory;


import com.lqc.javabase.factory.ICourse;
import com.lqc.javabase.factory.JavaCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * @ClassName: SimpleFactoryTest
 * @description: 简单工厂，根据不同的类名和字节码文件创建出不同的对象,适用于很简单的逻辑，
 * 创建的对象较少，客户端只需要传入参数，不需要管创建的细节
 *
 * 缺点：不容易扩展，一个方法只能创建一个对象
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 21:36
 * @version: 1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
    CourseFactory  cf = new CourseFactory();
        /*ICourse java = cf.createCourse("com.lqc.javabase.factory.JavaCourse");*/
        /**
         * 通过全类名创建
         */
        ICourse java = cf.createCourse("null");
        java.record();
        /**
         * 通过字节码文件创建
         */
        ICourse course = cf.createCourse(JavaCourse.class);
        course.record();

        //简单工厂的是实现
        Calendar.getInstance();
        LoggerFactory.getLogger("");
    }

}
