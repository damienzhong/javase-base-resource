package damien.list.arraylist;

import damien.array.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  用ArrayList实现遍历学生对象
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList arrayList = new ArrayList();

        Student student1 = new Student("呆萌钟", 25);
        Student student2 = new Student("老付", 24);
        Student student3 = new Student("小锐", 22);
        Student student4 = new Student("眨眼睛", 22);
        Student student5 = new Student("Zj", 29);
        Student student6 = new Student("努力", 20);
        //添加元素
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        //方式一：迭代器方式
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            //ClassCastException
            //String s = (String)iterator.next();
            Student s = (Student)iterator.next();
            System.out.println(s);
        }
        System.out.println("--------------------");
        //方式二：循环
        for (int i=0;i<arrayList.size();i++){
            Student s = (Student)arrayList.get(i);
            System.out.println(s);
        }
    }
}
