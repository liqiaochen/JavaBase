package com.lqc.javabase.delegate.simple;

/**
 * @ClassName: IEmployee
 * @description: 员工
 * @author: LiQiaoChen
 * @date: 2020/6/12 21:40
 * @version: 1.0
 */
public interface IEmployee {
    /**
     * 做事
     * @param command
     */
    void doing(String   command);
}
