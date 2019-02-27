package damien.file;

import java.io.File;
import java.io.IOException;

/**
 * 重命名功能：public boolean renameTo(File dest)
 *      如果路径名相同，就是改名
 *      如果路径名不同，就是改名并剪切
 *
 * 绝对路径：路径以盘符开头的  C:\\a.txt
 * 相对路径：路径不以盘符开头的  damien.txt
 */
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("damien.txt");
//        file.createNewFile();

        //需求：修改damien.txt的文件名为DM潮人社区.txt
        File file2 = new File("DM潮人社区.txt");
        //System.out.println("renameTo:"+file.renameTo(file2));

        File file3 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\test.txt");
        System.out.println("renameTo:"+file2.renameTo(file3));
    }
}
