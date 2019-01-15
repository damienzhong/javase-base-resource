package com.damien.set;

import java.util.HashSet;
import java.util.Set;

/**
 *  Collection:
 *      List:
 *          有序（存储顺序和取出顺序一致），可重复
 *      Set：
 *          无序（存储顺序和取出顺序不一致），唯一
 *
 * HashSet：它不保证Set的迭代顺序，特别是不保证该顺序恒久不变
 *
*/
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> s = new HashSet<String>();

        //添加元素
        s.add("hello");
        s.add("set");
        s.add("hashset");
        s.add("set2");
        s.add("set3");
        s.add("hello");
        s.add("hashset");

        //遍历
        for (String ss : s){
            System.out.println(ss);
        }
    }
}
