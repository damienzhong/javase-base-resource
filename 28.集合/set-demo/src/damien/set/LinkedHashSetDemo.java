package damien.set;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet:底层的数据结构是由哈希表和链表组成的。
 *  唯一性：通过哈希表实现
 *  有序（存储和取出是一致的）：由链表实现
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        //添加元素
        lhs.add("hello");
        lhs.add("LinkedHashSet");
        lhs.add("Set");
        lhs.add("LinkedHashSet");
        lhs.add("Set");

        //遍历
        for (String s:lhs){
            System.out.println(s);
        }
    }
}
