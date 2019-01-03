/**
	获取数组中的最值（最大值、最小值）
*/
public class ArrayTest02{
	public static void main(String[] args){
		//定义一个数组
		int[] arr = {8,3,9,7,5,10,33};
		int max = getMax(arr);
		System.out.println(max);
		System.out.println("--------------------");
		int min = getMin(arr);
		System.out.println(min);
	}
	
	//获取数组中的最大值
	public static int getMax(int[] arr){
		//获取数组中的最大值
		int max = arr[0];
		//遍历其他元素
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		//最后参照物里面保存的就是最大值
		return max;
		//System.out.println(max);
	}
	
	//获取数组中的最小值
	public static int getMin(int[] arr){
		//初始化最小值
		int min = arr[0];
		//遍历元素
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
}