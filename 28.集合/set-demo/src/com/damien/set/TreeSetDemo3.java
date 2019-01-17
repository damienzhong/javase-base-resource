package com.damien.set;


import com.damien.bean.Student;

import java.util.TreeSet;

/**
 * TreeSet存储自定义学生对象并保证排序和唯一。
 * 排序：自然排序，按照年龄从小到大排序
 * 唯一：成员变量值都相同即为同一个元素
 *
 * 课后练习：
 *      根据姓名长度排序
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new MyComparator());

        //创建元素
        Student s1 = new Student("呆萌钟", 24);
        Student s2 = new Student("米豆", 13);
        Student s3 = new Student("老付到底", 23);
        Student s4 = new Student("眨眼间的方式发放", 21);
        Student s5 = new Student("呆萌钟", 24);
        Student s6 = new Student("呆萌钟", 25);
        Student s7 = new Student("呆萌", 24);
        Student s8 = new Student("米豆", 23);

        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        //遍历
        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
