package damien.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合的特有功能：
 *      A：添加功能
 *          void add(int index,E element)：在列表中指定的位置上插入指定的元素
 *      B：获取功能
 *          E get(int index)：返回此列表中指定位置的元素。
 *      C：列表迭代器
 *          ListIterator<E> listIterator()：List集合特有的迭代器
 *      D：删除功能
 *          E remove(int index)：根据索引删除元素，返回被删除的元素
 *      E：修改功能
 *          E set(int index,E element)：根据索引修改元素，返回被修改的元素
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //创建一个集合对象
        List list = new ArrayList();

        //添加元素
        list.add("呆萌钟");
        list.add("你好啊");
        list.add("保持更新呀！");

        System.out.println("list:" + list);

        //void add(int index,E element)：在列表中指定的位置上插入指定的元素
        //list.add(1,"DM潮人社区");
        //IndexOutOfBoundsException
        //list.add(20,"欢迎光临");
        //list.add(3,"hello");
        //list.add(4,"欢迎光临");
//        System.out.println("list:" + list);

        //E get(int index)：返回此列表中指定位置的元素。
        //System.out.println("get:"+list.get(1));
        //System.out.println("get:"+list.get(4));

        //E remove(int index)：根据索引删除元素，返回被删除的元素
        //System.out.println("remove:"+list.remove(1));
        //System.out.println("remove:"+list.remove(4));

        //E set(int index,E element)：根据索引修改元素，返回被修改的元素
        System.out.println("set:"+list.set(3,"淘宝店"));
        System.out.println("list:" + list);
    }
}
