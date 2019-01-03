package damien.list;

import java.util.LinkedList;

/**
 *  LinkedList特有方法：
 *     A：添加功能
 *      public void addFirst(E e)：在此列表的开始处插入指定的元素。
 *      public void addLast(E e):将指定的元素插入到列表的结束。
 *     B：获取功能
 *      public E getFirst()：返回此列表中的第一个元素。
 *      public E getLast()：返回此列表中的最后一个元素。
 *     C：删除功能
 *      public E removeFirst()：移除并返回此列表中的第一个元素。
 *      public E removeLast()：移除并返回此列表中的最后一个元素。
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合元素
        LinkedList linkedList = new LinkedList();

        //添加元素
        linkedList.add("呆萌钟");
        linkedList.add("早上好");
        linkedList.add("天气不错~");

        //public void addFirst(E e)：在此列表的开始处插入指定的元素。
//        linkedList.addFirst("hello");
        //public void addLast(E e):将指定的元素插入到列表的结束。
        //linkedList.addLast("hello");
        //public E getFirst()：返回此列表中的第一个元素。
        //System.out.println(linkedList.getFirst());
       //public E getLast()：返回此列表中的最后一个元素。
//        System.out.println(linkedList.getLast());

        //public E removeFirst()：移除并返回此列表中的第一个元素。
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList);

        //public E removeLast()：移除并返回此列表中的最后一个元素。
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
