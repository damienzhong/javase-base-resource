package com.damien.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历输出map
 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        map.put("001", "呆萌钟");
        map.put("002", "老付");
        map.put("003", "努力");
        map.put("004", "呆萌");
        map.put("005", "孙悟空");

        //遍历
        Set<String> set = map.keySet();
        for (String key:set){
            //根据键找值
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
