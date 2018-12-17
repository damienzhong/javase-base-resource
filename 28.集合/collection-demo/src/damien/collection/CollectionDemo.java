package damien.collection;

//import java.util.ArrayList;


import damien.array.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 数组与集合的区别：
 *      A:长度区别：
 *          数组的长度是固定的
 *          集合长度是可变的
 *      B：内容不同
 *          数组存储的是同一种类型的元素
 *          集合可以存储不同类型的元素
 *      C：存储的元素的数据类型不同
 *          数组可以存储基本数据类型，也可以存储引用数据类型
 *          集合只能存储引用类型
 *
 *  Collection的功能概述：
 *      1、添加功能：
 *          boolean add(Object o)：添加一个元素
 *          boolean addAll(Collection c):添加一个集合的元素
 *      2、删除功能：
 *          void clear()：从这个集合中移除所有的元素
 *          boolean remove(Object o)：移除一个元素
 *          boolean removeAll(Collection c)：删除此集合中包含的所有元素（可选操作）的所有元素（可选操作）
 *      3、获取功能：
 *          Iterator<E> iterator()：返回此集合中的元素的迭代器
 *      4、判断功能：
 *          boolean contains(Object o)：判断集合中是否包含指定的元素
 *          boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素
 *          boolean isEmpty()：判断集合是否为空
 *      5、长度功能
 *          int size()：获取集合的长度
 *      6、把集合转换为数组：
 *          Object[] toArray()
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        System.out.println(c);
        Student student1 = new Student("呆萌钟", 25);
        Student student2 = new Student("老付", 24);
        Student student3 = new Student("小锐", 22);
        Student student4 = new Student("眨眼睛", 22);
        Student student5 = new Student("Zj", 29);
        Student student6 = new Student("努力", 20);
        //添加功能
        //boolean add(Object o)：添加一个元素
        c.add(student1);
        c.add(student2);
        c.add(student3);
        System.out.println(c);
        //boolean addAll(Collection c):添加一个集合的元素
        Collection c2 = new ArrayList();
        c2.add(student4);
        c2.add(student5);
        System.out.println(c2);
        c.addAll(c2);
        System.out.println(c);
        System.out.println("---------------------------");
        //删除功能
        //void clear()：从这个集合中移除所有的元素
//        c.clear();
//        System.out.println(c);
        //boolean remove(Object o)：移除一个元素
//        c.remove(student1);
        //boolean removeAll(Collection c)
        Collection c3 = new ArrayList();
        c3.add(student6);
        c3.addAll(c2);
        c.removeAll(c3);
        System.out.println(c);
        System.out.println("---------------------------");
        //长度功能
        //int size()：获取集合的长度
        System.out.println(c.size());
        System.out.println(c2.size());
        System.out.println(c3.size());
    }
}
