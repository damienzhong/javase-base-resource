package com.damien.day03;

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

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        Student student = (Student)obj;
        if(this.name.equals(student.name)&&this.age==student.age){
            return true;
        }else{
            return false;
        }
    }
}
