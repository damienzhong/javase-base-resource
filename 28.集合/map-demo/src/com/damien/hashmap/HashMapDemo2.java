package com.damien.hashmap;

import com.damien.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap<String,Student>
 * 键：String类型的学号
 * 值：Student 学生对象
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, Student> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("超人", 55);
        Student s2 = new Student("海王", 15);
        Student s3 = new Student("神奇女侠", 63);
        Student s4 = new Student("神奇女侠", 63);

        //添加元素
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        hm.put("004", s4);

        //遍历
        Set<Map.Entry<String, Student>> set = hm.entrySet();
        for (Map.Entry<String, Student> me : set) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
