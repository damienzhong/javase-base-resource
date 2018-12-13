package damien.sort;

/**
 * 选择排序：
 * 从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处。
 * 其他的同理，即可得到一个排好序的数组。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {93, 21, 100, 76, 13};
        System.out.println(printArray(arr));

        System.out.println(printArray(selectSort(arr)));

    }

    /**
     * 遍历数组
     */
    public static String printArray(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str = str + +arr[i] + ",";
            }
        }
        str += "]";
        return str;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr){
        for (int x = 0; x < arr.length - 1; x++) {//控制的是排序的轮数
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        return arr;
    }
}
