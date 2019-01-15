package com.damien.set;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * TreeSet:由TreeMap实现，能够对元素按照某种规则进行排序
 *  排序方式有两种：
 *  1、自然排序
 *  2、比较器排序
 *
 *  TreeSet集合的特点：排序和唯一
 *
 *  TreeSet底层是基于TreeMap实现的，其中，排序是通过Comparator实现的
 *
 *  TreeSet:底层是由二叉树结构实现的。（红黑树是一种自平衡的二叉树）
 *
 *  二叉树存储方式：
 *      第一个元素的时候，直接作为根节点存储。
 *      从第二个元素开始，每个元素从根节点开始找
 *          大   就作为右子节点
 *          小   就作为左子节点
 *          相等  就不做存储
 *
 *  二叉树元素的获取：（前序遍历、中序遍历、后序遍历）
 *      从跟节点开始，按照左、中右的原则依次取出元素
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(6);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(6);
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(7);

        //TreeMap源码
        TreeMap<Object, Object> tm = new TreeMap<>();

        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
