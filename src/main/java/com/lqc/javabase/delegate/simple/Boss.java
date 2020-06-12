package com.lqc.javabase.delegate.simple;


/**
 * @ClassName: Boss
 * @description: TODO
 * @author: LiQiaoChen
 * @date: Created in 2020/6/12 21:36
 * @version: 1.0
 */
public class Boss {
    /**
     * 下命令
     */
    public  void command(String command, Leader leader){
        leader.doing(command);

    }
}
