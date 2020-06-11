package com.lqc.javabase.factory.factorymethod;

import com.lqc.javabase.factory.ICourse;

/**
 * @ClassName: ICourseFactory
 * @description: TODO
 * @author: LiQiaoChen
 * @date: 2020/6/11 22:14
 * @version: 1.0
 */
public interface ICourseFactory {
    /**
     * 创建对象
     * @return
     */
    public ICourse  create();
}
