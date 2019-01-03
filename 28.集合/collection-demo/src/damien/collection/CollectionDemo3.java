package damien.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator()：返回此集合中的元素的迭代器
 *      Object next():获取元素，并移动到下一个位置
 *          NoSuchElementException:没有这样的元素，因为集合已经找完了
 *      boolean hasNext()：如果还有元素可以迭代，则返回true
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add("呆萌钟");
        c.add("的淘宝男装店：");
        c.add("DM潮人社区");

        //Iterator iterator()：返回此集合中的元素的迭代器
        Iterator iterator = c.iterator();//实际返回的肯定是子类对象，多态

//        Object obj = iterator.next();
//        System.out.print(obj);
//        System.out.print(iterator.next());
//        System.out.print(iterator.next());

//        if (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
//        if (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
//        if (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
//        if (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }

        while(iterator.hasNext()){
            System.out.print((String)iterator.next());
        }
    }
}
