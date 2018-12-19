package damien.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  List接口概述：
 *      有序的Collection(也称为序列)。此接口的用户可以对列表中每个元素的插入位置进行精确地
 *      控制。用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。
 *
 *      与Set不同，列表通常允许重复的元素。
 *
 *  特点：
 *      有序，可重复
 */
public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合元素
        List list = new ArrayList();

        //添加元素
        list.add("米豆");
        list.add("米豆");
        list.add("呆萌钟");
        list.add("小锐");
        list.add("呆萌钟");

        //遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
    }
}
