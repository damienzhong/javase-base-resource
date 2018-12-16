package damien.collection;

/**
 * 数组与集合的区别：
 *      A:长度区别：
 *          数组的长度是固定的
 *          集合长度是可变的
 *      B：内容不同
 *          数组存储的是同一种类型的元素
 *          集合可以存储不同类型的元素
 *      C：存储的元素的数据类型不同
 *          数组可以存储基本数据类型，也可以存储引用数据类型
 *          集合只能存储引用类型
 *
 *  Collection的功能概述：
 *      1、添加功能：
 *          boolean add(Object o)：添加一个元素
 *          boolean addAll(Collection c):添加一个集合的元素
 *      2、删除功能：
 *          void clear()：从这个集合中移除所有的元素
 *          boolean remove(Object o)：移除一个元素
 *          boolean removeAll(Collection c)：删除此集合中包含的所有元素（可选操作）的所有元素（可选操作）
 *      3、获取功能：
 *          Iterator<E> iterator()：返回此集合中的元素的迭代器
 *      4、判断功能：
 *          boolean contains(Object o)：判断集合中是否包含指定的元素
 *          boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素
 *          boolean isEmpty()：判断集合是否为空
 *      5、长度功能
 *          int size()：获取集合的长度
 *      6、把集合转换为数组：
 *          Object[] toArray()
 */
public class CollectionDemo {
    public static void main(String[] args) {

    }
}
