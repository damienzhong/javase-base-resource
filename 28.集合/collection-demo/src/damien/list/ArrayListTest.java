package damien.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  ArrayList去除集合中字符串的重复值
 *
 *  分析：
 *      A：创建一个新的集合
 *      B: 遍历旧集合，获取到每一个元素
 *      C: 拿这个元素和新集合进行比较，看看新集合中是否存在
 *          有：不往新集合放
 *          没有：添加到新集合
 *
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("good");
        arrayList.add("world");
        arrayList.add("nice");
        arrayList.add("java");

        System.out.println(arrayList);
        //创建新集合
        ArrayList newArrayList = new ArrayList();

        //遍历旧集合
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String s = (String)iterator.next();

            //比较新集合中是否存在
            if(!newArrayList.contains(s)){
                newArrayList.add(s);
            }
        }

        //遍历新集合
//        for (int i = 0;i<newArrayList.size();i++){
//            String s = (String)newArrayList.get(i);
//            System.out.println(s);
//        }
        System.out.println(newArrayList);
    }
}
