package damien.news_02;

import java.util.Arrays;
import java.util.List;

/**
 * @author damienzhong
 */
public class AsListDemo {
    public static void main(String[] args) {
//        指定数组支持的一个固定大小的列表
        List<String> list = Arrays.asList("呆萌钟", "淘宝", "男装店", ":", "DM潮人社区");
        //list.add("欢迎光临");//UnsupportedOperationException
        list.remove(1);
        for (String s : list){
            System.out.print(s);
        }

    }
}
