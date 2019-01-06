package damien.set;

import java.util.HashSet;

/**
 * HashSet是基于HashMap实现的
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("java");

        //遍历输出
        for (String s : set){
            System.out.println(s);
        }
    }
}
