package com.lqc.javabase.factory.simplefactory;


import com.lqc.javabase.factory.ICourse;

/**
 * @ClassName: CourseFactory
 * @description: 课程工厂
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 21:38
 * @version: 1.0
 */
public class CourseFactory {
    /**
     * 使用全类名创建对象
     * @param className
     * @return
     */
    public ICourse createCourse(String className) {
        try {
            if (className!=null && ! className.equals("")){
                System.out.println("className="+className);
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    /**
     * 通过字节码文件创建对象
     * @param clazz
     * @return
     */
    public ICourse  createCourse(Class clazz ) {
        try {
            if (clazz != null){
                System.out.println("class="+clazz);
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
