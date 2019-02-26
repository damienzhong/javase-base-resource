package damien.file;

import java.io.File;
import java.io.IOException;

/**
 * 删除功能：public boolean delete()
 *
 * 注意：
 *  1、如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下
 *  2、要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 *  3、Java中的删除不走回收站
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File file = new File("delet-demo.txt");
        System.out.println("createNewFile:"+file.createNewFile());

        //创建文件夹
        File file2 = new File("a\\b\\c");
        System.out.println("mkdirs:"+file2.mkdirs());

        //删除delet-demo.txt文件
        File file3 = new File("delet-demo.txt");
        System.out.println("delete:"+file3.delete());

        //删除a文件夹

        File file6 = new File("a\\b\\c");
        System.out.println("delete:"+file6.delete());

        File file5 = new File("a\\b");
        System.out.println("delete:"+file5.delete());

        File file4 = new File("a");
        System.out.println("delete:"+file4.delete());

    }
}
