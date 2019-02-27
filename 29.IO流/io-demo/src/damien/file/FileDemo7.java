package damien.file;

import java.io.File;

/**
 * 高级获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo7 {
    public static void main(String[] args) {
        File file = new File("D:\\MyGit\\javase-base-resource");

        //public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
//        String[] list = file.list();
//        for (String s : list) {
//            System.out.println(s);
//        }

        //public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.length());
        }
    }
}
