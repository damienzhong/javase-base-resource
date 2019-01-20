package com.damien.hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 *  HashMap:基于哈希表的 Map接口的实现
 *      哈希表的作用是用来保证键的唯一性。
 *
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("西游记","孙悟空");
        hashMap.put("红楼梦","贾宝玉");
        hashMap.put("三国演义","刘备");
        hashMap.put("水浒传","宋江");
        hashMap.put("西游记","孙悟空");

        //遍历
        Set<String> set = hashMap.keySet();
        for (String key:set){
            String value = hashMap.get(key);
            System.out.println(key+"="+value);
        }
    }
}
