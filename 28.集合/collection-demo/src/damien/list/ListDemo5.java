package damien.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *  ListIterator<E> listIterator() :返回列表元素的列表迭代器
 *      该迭代器继承了Iterator 迭代器，所以，就可以直接使用Iterator的方法
 *
 *      previous()获取上一个元素
 *      hasPrevious()判断是否还有上个元素
 *
 *      区别：ListIterator可以实现双向遍历，但是必须先正向遍历，才能逆向遍历。没有意义，很少用
 */
public class ListDemo5 {
    public static void main(String[] args) {
        //创建List集合对象
        List list = new ArrayList();

        //添加元素
        list.add("呆萌钟");
        list.add("的淘宝店:");
        list.add("DM潮人社区");

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String s = (String)listIterator.next();
            System.out.print(s);
        }
        System.out.println();
        System.out.println("---------------");

//        ListIterator listIterator2 = list.listIterator();
        while (listIterator.hasPrevious()){
            String s = (String)listIterator.previous();
            System.out.print(s);
        }

        System.out.println();
        System.out.println("---------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.print(s);
        }
    }
}
