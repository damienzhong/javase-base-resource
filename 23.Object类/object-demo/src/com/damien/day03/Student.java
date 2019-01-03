package com.damien.day03;

import java.util.Objects;

/**
 * @author damienzhong
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

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

//    @Override
//    public boolean equals(Object obj) {
////        return super.equals(obj);
//        Student student = (Student)obj;
//        if(this.name.equals(student.name)&&this.age==student.age){
//            return true;
//        }else{
//            return false;
//        }
//    }


//    @Override
//    public boolean equals(Object obj) {
//
//        if(this==obj){
//            return true;
//        }
//        //对象名 instanceof 类名
//        if(!(obj instanceof Student)){
//            return false;
//        }
//        Student student = (Student)obj;
//        System.out.println("向下转型完成");
//        return this.name.equals(student.name)&&this.age==student.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

}
