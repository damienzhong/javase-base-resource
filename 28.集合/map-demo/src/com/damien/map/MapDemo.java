package com.damien.map;

/**
 *  Map概述：
 *      a:将键映射到值的对象。
 *      b:一个映射不能包含重复的键。
 *      c:每个键可以映射到至多一个值。
 *  是存储的键值对
 *  注意：Map的键是唯一的，但是值是可以重复的
 *
 *  Map的功能概述：
 *      1、添加功能
 *          V put(K key, V value)：添加元素
 *      2、删除功能
 *          void clear()：移除所有的键值对元素
 *          V remove(Object key)：根据键删除键值对元素，并把值返回
 *      3、判断功能
 *          boolean containsKey(Object key)：判断集合是否包含指定的键
 *          boolean containsValue(Object value)：判断集合是否包含指定的值
 *          boolean isEmpty()：判断集合是否为空
 *      4、获取功能
 *          V get(Object key)：根据键获取值
 *          Set<K> keySet()：获取集合中所有键的集合
 *          Collection<V> values()：获取集合中所有值的集合
 *          Set<Map.Entry<K,V>> entrySet()：
 *      5、长度功能
 *          int size()：返回集合中的键值对的对数
 *
 */
public class MapDemo {
    public static void main(String[] args) {

    }
}
