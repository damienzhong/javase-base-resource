package com.damien.interview;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 面试题：
 *  1、HashMap与Hashtable的区别？
 *  HashMap：线程不安全，效率高，键和值都允许为null
 *  Hashtable：线程安全，效率低，键和值都不允许为null
 *      （如果需要线程安全的场景也不用Hashtable，用CurrentHashMap）
 *
 *  2、List、Set、Map接口是否继承自Map接口？
 *  List、Set不是继承自Map接口，他们继承自Collection接口
 *  Map接口本身就是一个顶层接口
 */
public class InterviewTest {
    public static void main(String[] args) {
//        HashMap<String, String> hm = new HashMap<>();
        Hashtable<String, String> hm = new Hashtable<>();
        hm.put("aa","aa");
    }
}
