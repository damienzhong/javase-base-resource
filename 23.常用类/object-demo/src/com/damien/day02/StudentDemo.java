package com.damien.day02;

/**
 *  public String toString():返回对象的字符串表示形式
 *  Integer类下的一个静态方法：
 *      public static String toHexString(int i):把一个整数转成十六进制表示的字符串
 *
 *   建议所有子类都重写此方法。
 *   重写方案：
 *      自动生成toString()方法
 *
 *  注意：
 *      直接输出一个对象名称，其实就是调用该对象的toString()方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.hashCode());
        System.out.println(student.getClass());
        System.out.println("---------------------");
        System.out.println(student.toString());//com.damien.day02.Student@1540e19d
        System.out.println("---------------------");
        //toString()方法等价于getClass().getName() + '@' + Integer.toHexString(hashCode())
        System.out.println(student.getClass().getName()+"@"+Integer.toHexString(student.hashCode()));

        System.out.println(student);
    }
}
