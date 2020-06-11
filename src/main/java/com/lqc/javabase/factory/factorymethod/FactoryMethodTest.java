package com.lqc.javabase.factory.factorymethod;

import com.lqc.javabase.factory.ICourse;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: FactoryMethodTest
 * @description: 一对多的关系
 * 工厂方法模式，可拓展性强,不需要关注创建的细节
 * 缺点：类的个数过多，代码结构复杂，b变得更加难理解
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:21
 * @version: 1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();

        LoggerFactory.getLogger("");
    }


}
