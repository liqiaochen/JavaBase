package com.lqc.javabase.factory.abstactfactory;


import com.lqc.javabase.factory.ICourse;

/**
 * @ClassName: ICourseFactory
 * @description: 超级工厂
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 22:44
 * @version: 1.0
 */
public interface ICourseFactory {

    ICourse  createCourse();

    INote  createNote();

    IVideo  createVideo();
}
