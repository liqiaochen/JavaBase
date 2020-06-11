package com.lqc.javabase.factory;


/**
 * @ClassName: JavaCourse
 * @description: Java课程
 * @author: LiQiaoChen
 * @date: Created in 2020/6/11 21:34
 * @version: 1.0
 */
public class JavaCourse  implements ICourse{
    /**
     *录制
     */
    @Override
    public void record() {
        System.out.println("正在录制Java视频");
    }
}
