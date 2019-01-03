package com.damien.day03;

/**
 * public boolean equals(Object obj):指示是否有其他对象“等于”这一个。
 *  重写的好处：
 *      提高效率，提高程序的健壮性
 * ==:
 *  基本类型：比较的是值是否相同
 *  引用类型：比较的就是地址值是否相同
 *
 *  equals：
 *      引用类型：默认情况下，比较的是地址值。
 *      我们重写的话一般都是自动生成
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("呆萌钟", 24);
        Student s2 = new Student("呆萌钟", 24);
        System.out.println(s1 == s2);//false
        Student s3 = s1;
        System.out.println(s1 == s3);//true
        System.out.println("----------------------");

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        Student s4 = new Student("Damien", 20);
        Student s5 = s4;
        s5.setName("AA");
        s5.setAge(18);
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s4));

        Demo demo = new Demo();
        System.out.println(s4.equals(demo));
    }
}

class Demo{
    
}