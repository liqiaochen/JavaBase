package com.lqc.javabase.delegate.simple;


/**
 * @ClassName: DelegateTest
 * @description: 委派模式，老板把事情交给领导，领导根据员工的特长分配任务
 * @author: LiQiaoChen
 * @date: Created in 2020/6/12 21:49
 * @version: 1.0
 */
public class DelegateTest {

    public static void main(String[] args) {
       new   Boss().command("加密", new Leader());
    }
}
