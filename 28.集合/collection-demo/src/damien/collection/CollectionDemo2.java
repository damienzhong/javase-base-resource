package damien.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 把集合转换为数组:
 *  Object[] toArray()
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add("呆萌钟");
        c.add("的淘宝男装店：");
        c.add("DM潮人社区");

        //Object[] toArray()
        Object[] objects = c.toArray();
        for (int i=0;i<objects.length;i++){
            //System.out.print(objects[i]);
            String s =(String) objects[i];
            System.out.print(s);
        }
    }
}
