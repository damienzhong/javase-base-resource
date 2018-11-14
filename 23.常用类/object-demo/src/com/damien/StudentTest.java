package com.damien;

/**
 * @author damienzhong
 */

/**
 * Object：Object类是类层次结构的根类，每个类都有 Object作为超类
 * 每个类都直接或者间接继承子Object
 *
 * Object类的方法：
 *      public int hashCode()：返回该对象的哈希代码值
 *          注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。你可以理解为地址值
 *
 *      public final Class<?> getClass():返回该 Object运行时类
 *          Class类的方法：
 *              public String getName()：返回单位名称（类，接口，数组类，原始类型，或无效）的 类对象表示，作为一个 String。
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.hashCode());//356573597

        Student s2 = new Student();
        System.out.println(s2.hashCode());//1735600054

        Student s3 = s1;
        System.out.println(s3.hashCode());//356573597

        System.out.println("-------------------");

        Student s = new Student();
        Class c = s.getClass();
        System.out.println(c);
        String name = c.getName();
        System.out.println(name);

        //链式编程
        String name1 = s.getClass().getName();
        System.out.println(name1);
    }
}
