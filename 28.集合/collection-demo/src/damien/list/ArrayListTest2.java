package damien.list;

import damien.array.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  去除集合中自定义对象的重复值（对象的成员变量值都相同）
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList arrayList = new ArrayList();

        //创建学生对象
        Student student1 = new Student("呆萌钟",25);
        Student student2 = new Student("呆萌钟",18);
        Student student3 = new Student("ssdd",25);
        Student student4 = new Student("bvfg",22);
        Student student5 = new Student("gg",21);
        Student student6 = new Student("gg",21);
        Student student7 = new Student("呆钟",16);
        Student student8 = new Student("呆萌钟",25);
        //添加元素
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);
        arrayList.add(student7);
        arrayList.add(student8);

        //创建新集合
        ArrayList newArrayList = new ArrayList();

        //遍历旧集合
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Student s = (Student)iterator.next();

            //拿这个元素与新集合比较
            if(!newArrayList.contains(s)){
                newArrayList.add(s);
            }
        }

        System.out.println(newArrayList);
    }
}
