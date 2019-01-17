package com.damien.set;

import com.damien.bean.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 匿名内部类方式实现
 */
public class TreeSetDemo4 {
    public static void main(String[] args) {
        //如果你的比较规则经常改变，建议使用匿名内部类方式，优势：代码解耦
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照姓名的长度排序
                int num = o1.getName().length() - o2.getName().length();
                //长度相同的情况下，比较姓名的内容
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                //姓名的长度与内容都相同的时候，比较年龄
                int num3 = num2 == 0 ? o1.getAge() - o2.getAge() : num2;
                return num3;
            }
        });

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
