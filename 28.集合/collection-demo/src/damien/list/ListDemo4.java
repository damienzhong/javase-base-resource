package damien.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 遍历List的元素，不用迭代器
 */
public class ListDemo4 {
    public static void main(String[] args) {
        //创建List集合的对象
        List list = new ArrayList();

        //添加元素
        list.add("呆萌钟");
        list.add("的淘宝店:");
        list.add("DM潮人社区");

//        System.out.print(list.get(0));
//        System.out.print(list.get(1));
//        System.out.print(list.get(2));

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
