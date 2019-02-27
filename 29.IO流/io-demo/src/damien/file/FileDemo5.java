package damien.file;

import java.io.File;
import java.io.IOException;

/**
 * 判断功能：
 *  public boolean isDirectory():判断是否是目录
 *  public boolean isFile()：判断是否是文件
 *  public boolean exists()：判断是否存在
 *  public boolean canRead()：判断是否可读
 *  public boolean canWrite()：判断是否可写
 *  public boolean isHidden()：判断是否隐藏
 */
public class FileDemo5 {
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("damien.txt");
//        File file = new File("damien");
//        file.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("isDirectory:"+file.isDirectory());
        System.out.println("isFile:"+file.isFile());
        System.out.println("exists:"+file.exists());
        System.out.println("canRead:"+file.canRead());
        System.out.println("canWrite:"+file.canWrite());
        System.out.println("isHidden:"+file.isHidden());
    }
}
