package com.damien.day04;


/**
 *  protected void finalize()
 *                  throws Throwable
 *  当垃圾回收器确定没有该对象的更多引用时，由对象的垃圾回收期调用此方法，用于垃圾回收。但是什么时候执行，不确定。
 *
 * protected Object clone()
 *                 throws CloneNotSupportedException
 *  创建并返回此对象的副本
 *  Cloneable:一个类实现 Cloneable接口的 Object.clone()方法表明，该方法对该类的实例字段复制是合法的
 *      这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的克隆
 */
public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();
        s.setName("呆萌钟");
        s.setAge(24);

        //克隆学生对象
        Object obj = s.clone();
        Student s2 = (Student)obj;

        System.out.println(s);
        System.out.println(s2);
        System.out.println("------------------------");

        Student s3 = s;
        System.out.println(s);
        System.out.println(s3);

        System.out.println(s3==s);
        System.out.println(s==s2);

        s3.setName("Damien");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

    }
}
