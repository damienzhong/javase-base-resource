package damien.sort;

/**
 * 冒泡排序：
 * 相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        int[] arr = {25, 19, 8, 31, 12};
        System.out.println("排序前：" + printArray(arr));
//        for (int i = 0; i < arr.length - 1 - 0; i++) {
//            if (arr[i] > arr[i + 1]) {//比较相邻的元素
//                //交换
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        System.out.println("第一轮排序：" + printArray(arr));
//        for (int i = 0; i < arr.length - 1 - 1; i++) {
//            if (arr[i] > arr[i + 1]) {//比较相邻的元素
//                //交换
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        System.out.println("第二轮排序：" + printArray(arr));
//        for (int i = 0; i < arr.length - 1 - 2; i++) {
//            if (arr[i] > arr[i + 1]) {//比较相邻的元素
//                //交换
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        System.out.println("第三轮排序：" + printArray(arr));
//        for (int i = 0; i < arr.length - 1 - 3; i++) {
//            if (arr[i] > arr[i + 1]) {//比较相邻的元素
//                //交换
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        System.out.println("第四轮排序：" + printArray(arr));

        for (int j = 0; j < arr.length - 1; j++) {//外层控制的是排序轮数
            for (int i = 0; i < arr.length - 1 - j; i++) {//内层循环控制每一轮的排序次数
                if (arr[i] > arr[i + 1]) {//比较相邻的元素
                    //交换
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + printArray(arr));
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
}
