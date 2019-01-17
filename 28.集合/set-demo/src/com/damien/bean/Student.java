package com.damien.bean;

import java.util.Objects;

/**
 * @author damienzhong
 */
public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

//    @Override
//    public int compareTo(Student o) {
//        //return -1;
//        //返回什么，其实应该根据我们的排序规则
//
//        //按照年龄从小到大排序
//        int num = this.age - o.age;
//
//        //成员变量值都相同即为同一个元素
//        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
//        return num2;
//    }

    @Override
    public int compareTo(Student o) {
        //按照姓名的长度排序
        int num = this.name.length() - o.name.length();
        //长度相同的情况下，比较姓名的内容
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        //姓名的长度与内容都相同的时候，比较年龄
        int num3 = num2 == 0 ? this.age - o.age : num2;
        return num3;
    }
}
