package damien.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取功能：
 *  public String getAbsolutePath():获取绝对路径
 *  public String getPath():获取相对路径
 *  public String getName():获取名称
 *  public long length():获取长度。字节数
 *  public long lastModified():获取最后一次的修改时间，毫秒值
 */
public class FileDemo6 {
    public static void main(String[] args) throws IOException {
        //创建一个文件对象
        File file = new File("damien\\test.txt");
        boolean newFile = file.createNewFile();
        System.out.println("createNewFile:"+newFile);

        System.out.println("getAbsolutePath:"+file.getAbsolutePath());
        System.out.println("getPath:"+file.getPath());
        System.out.println("getName:"+file.getName());
        System.out.println("length:"+file.length());
        System.out.println("lastModified:"+file.lastModified());

        //1551273257827
        Date date = new Date(1551273257827L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
