package com.damien.treemap;

import com.damien.bean.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap<Student,String>
 * 键：Student
 * 值：String
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        //年龄排序
                        int num = o1.getAge() - o2.getAge();
                        //姓名
                        int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                        return num2;
                    }
                }
        );

        //创建学生对象
        Student s1 = new Student("超人", 55);
        Student s2 = new Student("海王", 15);
        Student s3 = new Student("神奇女侠", 63);
        Student s4 = new Student("神奇女侠", 63);
        Student s5 = new Student("绿巨人", 35);
        Student s6 = new Student("钢铁侠", 36);
        Student s7 = new Student("钢铁侠", 37);

        //添加元素
        tm.put(s1, "外星人");
        tm.put(s2, "神");
        tm.put(s3, "女神");
        tm.put(s4, "女神");
        tm.put(s5, "变异人");
        tm.put(s6, "科技男");
        tm.put(s7, "科技男");

        //遍历
        Set<Student> set = tm.keySet();
        for (Student key : set) {
            String value = tm.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
