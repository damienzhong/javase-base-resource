package com.damien.treemap;

import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap：是基于红黑树的Map接口实现的
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();

        //添加元素
        tm.put("hello", "你好");
        tm.put("world", "世界");
        tm.put("java", "Java");
        tm.put("treeMap", "TreeMap");
        tm.put("hello", "你好呀");

        //遍历
        Set<String> set = tm.keySet();
        for (String key : set) {
            String value = tm.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
