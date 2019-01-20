package com.damien.hashmap;

import com.damien.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap<Student,String>
 * 键：Student
 * 要求：如果两个对象的成员变量值都相同，则为同一个对象
 * 值：String类型学号
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("超人", 55);
        Student s2 = new Student("海王", 15);
        Student s3 = new Student("神奇女侠", 63);
        Student s4 = new Student("神奇女侠", 63);

        //添加元素
        hm.put(s1, "001");
        hm.put(s2, "002");
        hm.put(s3, "003");
        hm.put(s4, "004");

        //遍历
        Set<Map.Entry<Student, String>> set = hm.entrySet();
        for (Map.Entry<Student, String> me : set) {
            System.out.println(me);
        }
    }
}
