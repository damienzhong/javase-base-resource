package com.damien.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections：是针对集合进行操作的工具类，都是静态方法
 *
 * 面试题：
 *  Collection和Collections的区别？
 *     Collection：是单列集合的顶层接口，有子接口List和Set
 *     Collections:是针对集合操作的工具类。有对集合进行操作的常用方法
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(63);
        list.add(31);
        list.add(13);
        list.add(47);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
