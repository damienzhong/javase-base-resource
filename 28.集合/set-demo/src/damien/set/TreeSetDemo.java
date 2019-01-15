package damien.set;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * TreeSet:由TreeMap实现，能够对元素按照某种规则进行排序
 *  排序方式有两种：
 *  1、自然排序
 *  2、比较器排序
 *
 *  TreeSet集合的特点：排序和唯一
 *
 *  TreeSet底层是基于TreeMap实现的，其中，排序是通过Comparator实现的
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(6);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(6);
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(7);

        //TreeMap源码
        TreeMap<Object, Object> tm = new TreeMap<>();

        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
