package damien.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author damienzhong
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();

        //添加元素
        list.add("呆");
        list.add("萌");
        list.add("钟");

        System.out.println(list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.print(s);
        }

    }
}
