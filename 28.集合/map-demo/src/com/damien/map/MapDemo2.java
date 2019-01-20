package com.damien.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的获取功能：
 * V get(Object key)：根据键获取值
 * Set<K> keySet()：获取集合中所有键的集合
 * Collection<V> values()：获取集合中所有值的集合
 * Set<Map.Entry<K,V>> entrySet()：
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        map.put("001", "呆萌钟");
        map.put("002", "老付");
        map.put("003", "努力");
        map.put("004", "呆萌钟");

        // V get(Object key)：根据键获取值
        System.out.println("get:" + map.get("001"));
        System.out.println("get:" + map.get("004"));
        System.out.println("----------------------");

        //Set<K> keySet()：获取集合中所有键的集合
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key);
        }
        System.out.println("----------------------");

        //Collection<V> values()：获取集合中所有值的集合
        Collection<String> ct = map.values();
        for (String c : ct) {
            System.out.println(c);
        }
    }
}
