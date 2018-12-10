package damien.select;

/**
 * 查找：
 *      基本查找：数组元素无序（从头找到尾）
 *      二分查找：数组元素有序
 *              思想：每次都是猜中间的那个元素，比较大小，就能减少一半的元素
 *
 *      思路：
 *          A：定义最大索引，最小索引
 *          B：计算出中间索引
 *          C：拿中间索引的值和要查找的值进行比较
 *              相等：就返回当前的中间索引
 *              不相等：
 *                  大：左边找
 *                  小：右边找
 *          D：重新计算出中间索引
 *              大：左边找
 *                  max = mid - 1;
 *              小：右边找
 *                  min = mid + 1;
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
    }

}
