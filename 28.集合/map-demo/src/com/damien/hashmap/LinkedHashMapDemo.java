package com.damien.hashmap;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * LinkedHashMap：是由Map接口的哈希表和链表实现的，具有可预知的迭代顺序
 * 由哈希表保证键的唯一性
 * 由链表保证键的有序性（存储和取出的顺序一致）
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

        //添加元素
        lhm.put("111", "hello");
        lhm.put("222", "linked");
        lhm.put("1443", "hash");
        lhm.put("893", "map");
        lhm.put("893", "map2");

        //遍历
        Set<String> set = lhm.keySet();
        for (String key : set) {
            String value = lhm.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
