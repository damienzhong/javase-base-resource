package com.damien.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Set<Map.Entry<K,V>> entrySet()
 */
public class MapDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        map.put("001", "呆萌钟");
        map.put("002", "老付");
        map.put("003", "努力");
        map.put("004", "呆萌");
        map.put("005", "孙悟空");

        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String, String> me : set) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
