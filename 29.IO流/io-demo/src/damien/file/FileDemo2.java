package damien.file;

import java.io.File;
import java.io.IOException;

/**
 * 创建功能：
 * public boolean createNewFile() throws IOException：创建文件，如果存在这样的文件，就不创建了
 * public boolean mkdir()：创建文件夹，如果存在这样的文件夹，就不创建了
 * public boolean mkdirs()：创建文件夹，如果父文件夹不存在的话，会帮你创建
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //需求：在D:\MyGit\javase-base-resource\29.IO流路径下创建一个名为demo的文件夹
        File file = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo");
        System.out.println("mkdir:" + file.mkdir());

        //需求：在D:\MyGit\javase-base-resource\29.IO流\demo路径下创建一个名为damien.txt的文件
        File file1 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo\\damien.txt");
        System.out.println("createNewFile:" + file1.createNewFile());

        //需求：我想在之前的demo目录下创建多级目录，D:\MyGit\javase-base-resource\29.IO流\demo\aa\bb\cc
//        File file2 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo\\aa");
//        File file3 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo\\aa\\bb");
//        File file4 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo\\aa\\bb\\cc");
//        System.out.println("mkdir:" + file2.mkdir());
//        System.out.println("mkdir:" + file3.mkdir());
//        System.out.println("mkdir:" + file4.mkdir());
        File file4 = new File("D:\\MyGit\\javase-base-resource\\29.IO流\\demo\\aa\\bb\\cc");
        System.out.println("mkdir:" + file4.mkdirs());
    }
}
