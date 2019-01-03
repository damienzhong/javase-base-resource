package damien.news_01;

import java.util.ArrayList;
import java.util.List;

/**
 *  JDK5新特性：
 *      增强for循环：是for的一种
 *
 *  格式：
 *      for(元素数据类型 变量 : 数组或者Collection集合){
 *          使用变量即可，该变量就是元素
 *      }
 *
 *  好处：简化了数组和集合的遍历
 *
 *  弊端：增强for的目标不能为null
 *        解决：做遍历之前前进行非空判断
 */
public class ForDemo {
    public static void main(String[] args) {
        String[] arr = {"呆萌钟","的","淘宝","男装店",":DM潮人社区"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("----------------------");

        for (String s : arr){
            System.out.print(s);
        }
        System.out.println();
        System.out.println("----------------------");

        ArrayList<String> array = new ArrayList<>();
        array.add("呆萌钟");
        array.add("的");
        array.add("淘宝");
        array.add("男装店");
        array.add(":DM潮人社区");
        for(String s : array){
            System.out.print(s);
        }

        System.out.println();
        System.out.println("----------------------");

        List<String> list = null;
        if(list!=null){
            //NullPointerException
            for (String s : list){
                System.out.println(s);
            }
        }

        //增强for循环底层是用迭代器实现的
        for(String s : array){
            if("淘宝".equals(s)){
                //ConcurrentModificationException 并发修改异常
                array.add("aaaa");
            }
        }
    }
}
