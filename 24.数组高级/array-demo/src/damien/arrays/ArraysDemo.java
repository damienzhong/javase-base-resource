package damien.arrays;

import java.util.Arrays;

/**
 * Arrays：针对数组操作的工具类。比如排序、查找
 *  public static String toString(int[] a)把数组转成字符串
 *  public static void sort(int[] a) 对数组进行升序排序
 *  public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {25, 19, 8, 31, 12};

        //public static String toString(int[] a)
        System.out.println(Arrays.toString(arr));

        //public static void sort(int[] a) 对数组进行升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);
    }
}
