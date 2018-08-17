/**
	数组遍历：就是依次输出数组中的每一个元素
	
	注意：数组提供了一个属性length，用于获取数组的长度
		格式:数组名.length
*/
public class ArrayTest{
	public static void main(String[] args){
		//定义数组
		int[] arr = {11,22,33,44,55};
		
		//获取每一个元素
		//如何获取？我们知道数组名结婚编号(索引)就可以找到数据
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("----------------------");
		//虽然这种做法可以，但是不是我们想要的
		//代发重复度高
		//输出语句、数组名都是相同的，仅仅是索引的变化
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,5,2,1,5,4};
		
		System.out.println(arr.length);
		System.out.println(arr2.length);
		System.out.println("----------------------");
		//改进
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("----------------------");
		printArray2(arr);
		System.out.println();
		System.out.println("----------------------");
		printArray2(arr2);
	}
	
	/**
		遍历数组的方法
		两个明确:
			返回值类型：void
			参数列表：int[] arr
	*/
	public static void printArray(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//改进版
	public static void printArray2(int[] arr){
		System.out.print("[");		
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}
			
		}
	}
}