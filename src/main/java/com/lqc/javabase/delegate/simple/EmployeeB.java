package com.lqc.javabase.delegate.simple;


/**
 * @ClassName: EmployeeA
 * @description: A员工擅长业务
 * @author: LiQiaoChen
 * @date: Created in 2020/6/12 21:41
 * @version: 1.0
 */
public class EmployeeB implements IEmployee{

    /**
     * 做事
     * @param command
     */
    @Override
    public void doing(String command) {
        System.out.println("我开始干活了，我擅长业务，执行"+command);
    }
}
