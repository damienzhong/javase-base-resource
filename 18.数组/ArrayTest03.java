/**
	数组元素逆序（就是把元素对调）
	
	思路分析：
		把0索引和arr.length-1的数据交换
		把1索引和arr.length-2的数据交换
		...
		只要做到arr.length/2的时候即可
*/
public class ArrayTest03{
	public static void main(String[] args){
		//定一个数组
		int[] arr = {22,13,85,11,56,55,33,66};
		//逆序前
		printArray(arr);
		System.out.println("---------------");
		//逆序
		reverse(arr);
		//逆序后
		printArray(arr);
	}
	
	//数组逆序
	public static void reverse(int[] arr){
		/*//第一次交换
		int temp = arr[0];
		arr[0] = arr[arr.length-1-0];
		arr[arr.length-1] = temp;
		
		//第二次交换
		int temp = arr[1];
		arr[1] = arr[arr.length-1-1];
		arr[arr.length-2] = temp;
		
		//第三次交换
		int temp = arr[2];
		arr[2] = arr[arr.length-1-2];
		arr[arr.length-3] = temp;
		*/
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	
	//遍历数组
	public static void printArray(int[] arr){
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