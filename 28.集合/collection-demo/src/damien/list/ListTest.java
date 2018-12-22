package damien.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 题目：判断一个集合里面有没有"呆萌钟"这个元素，如果有，就添加一个元素"DM潮人社区",请写代码实现
 *
 *      ConcurrentModificationException:检测到的对象的并发修改时，这样的修改是不允许的,抛出异常
 *      产生原因：
 *          迭代器是依赖于集合的，在判断成功之后，集合中新添加了元素，而迭代器却不知道，所以就报错拉，这个错叫并发修改异常
 *      注意：通过迭代器Iterator遍历集合的时候，集合是不能修改元素的
 *
 *      解决方案：
 */
public class ListTest {
    public static void main(String[] args) {
        //创建List集合元素
        List list = new ArrayList();

        //添加元素
        list.add("嗨~");
        list.add("呆萌钟");
        list.add("的淘宝店铺：");

        //迭代器遍历
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String s = (String) iterator.next();
//            if ("呆萌钟".equals(s)) {
//                list.add("DM潮人社区");
//            }
//        }

        //通过ListIterator遍历迭代
//        ListIterator listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            String s = (String) listIterator.next();
//            if ("呆萌钟".equals(s)) {
//                listIterator.add("DM潮人社区");
//            }
//        }

       //循环遍历
        for(int i = 0;i<list.size();i++){
            String s = (String)list.get(i);
            if ("呆萌钟".equals(s)) {
                list.add("DM潮人社区");
            }
        }
        System.out.print(list);
    }
}
