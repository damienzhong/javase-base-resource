package damien.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  泛型：是一种把类型明确的功罪推迟到创建对象后者调用方法的时候才去明确的特殊的类型，参数化类型，把类型当作参数一样的传递
 *
 *  格式：
 *      <数据类型>
 *      此处的类型必须是引用类型
 *
 *  好处：
 *      A：把运行时期的问题提前到了编译时期
 *      B: 避免了强制类型转换异常
 *      C: 优化了程序设计，消除了黄色警告线（用eclipse可以看到）
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("呆萌钟");
        arrayList.add("DM潮人社区");
        arrayList.add("欢迎光临");

//        arrayList.add(10);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
           String s = (String)iterator.next();

           System.out.println(s);
        }
    }
}
