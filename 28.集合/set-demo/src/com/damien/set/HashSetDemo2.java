package com.damien.set;

import damien.bean.Student;

import java.util.HashSet;

/**
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：两个对象的成员变量值相同，则为同一元素
 *
 * 通过观察源码，发现add方法是跟hashCode()与equals()有关的
 *
 * 成员变量会影响哈希值
 *  比较唯一性：把对象的成员变量值进行相加：
 *      如果是基本数据类型，就直接相加
 *      如果是引用类型，就加哈希值
 *  name.hashCode=40 ,age=30
 *  name.hashCode=20,age=50
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hs = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("呆萌钟", 24);
        Student s2 = new Student("米豆", 13);
        Student s3 = new Student("老付", 23);
        Student s4 = new Student("眨眼间", 21);
        Student s5 = new Student("呆萌钟", 24);
        Student s6 = new Student("呆萌钟", 25);
        Student s7 = new Student("呆萌", 24);

        //添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);
        hs.add(s7);

        //遍历集合
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
