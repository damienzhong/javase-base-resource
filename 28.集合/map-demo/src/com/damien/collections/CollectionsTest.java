package com.damien.collections;

import com.damien.bean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 使用Collections排序存储自定义对象的集合
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("呆萌钟", 24);
        Student s2 = new Student("蜘蛛侠", 25);
        Student s3 = new Student("哪吒", 18);
        Student s4 = new Student("孙悟空", 560);
        Student s5 = new Student("呆萌钟", 24);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //如果同时存在自然排序和比较器排序，以比较器排序为主
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getAge() - o1.getAge();
                return num;
            }
        });

        //遍历
        for (Student s:list) {
            System.out.println(s.getName()+"="+s.getAge());
        }
    }
}
