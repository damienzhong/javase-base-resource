package com.damien.set;

import com.damien.bean.Student;

import java.util.Comparator;

/**
 * @author damienzhong
 */
public class MyComparator implements Comparator<Student> {
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
}
