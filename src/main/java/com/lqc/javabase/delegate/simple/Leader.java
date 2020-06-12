package com.lqc.javabase.delegate.simple;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: leader
 * @description: TODO
 * @author: LiQiaoChen
 * @date: Created in 2020/6/12 21:37
 * @version: 1.0
 */
public class Leader {

    /**
     * 需要知道员工的特长，分发任务
     */
    private Map<String,IEmployee> register = new HashMap<>();

    public  Leader(){
        register.put("加密", new EmployeeA());
        register.put("业务", new EmployeeB());
    }

    public void doing(String command){
        register.get(command).doing(command);
    }
}
