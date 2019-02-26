package damien.file;

import java.io.File;

/**
 * File:文件和目录（文件夹）路径名的抽象表示形式
 *
 * 构造方法：
 *  public File(String pathname)：根据一个路径得到一个File对象
 *  public File(String parent,String child):根据一个目录和一个子文件/子目录得到File对象
 *  public File(File parent,String child):根据一个父File对象和一个子文件/子目录得到File对象
 */
public class FileDemo {
    public static void main(String[] args) {
        //public File(String pathname):根据一个路径得到一个File对象
        File file = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\damien.txt");

        //public File(String parent,String child):根据一个目录和一个子文件/子目录得到File对象
        File file1 = new File("D:\\MyGit\\javase-base-resource\\29.IO流", "damien.txt");

        //public File(File parent,String child):根据一个父File对象和一个子文件/子目录得到File对象
        File file2 = new File("D:\\MyGit\\javase-base-resource\\29.IO流");
        File file3 = new File(file2, "damien.txt");

        //以上三种方式其实效果是一样的
    }
}
