/**
	数组元素查找（查找指定元素第一次在数组中出现的索引）
*/
public class ArrayTest04{
	public static void main(String[] args){
		//定义数组
		int[] arr = {20,18,88,53,27,56,44,33};
		
		int index = getIndex(arr,100);
		System.out.println(index);
		System.out.println("-------------");
		int index2 = getIndex2(arr,100);
		System.out.println(index2);
	}
	
	//查找指定元素第一次在数组中出现的索引
	public static int getIndex(int[] arr,int value){
		//遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				//如果相等，就返回当前的索引值
				return i;
			}
		}
		//如果找不到数据，我们一般返回一个数据进行标识失败，一般是用负数
		return -1;
	}
	
	public static int getIndex2(int[] arr,int value){
		//定义一个索引
		int index = -1;
		
		//有就修改索引值
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				//如果相等，就返回当前的索引值
				index = i;
				break;
			}
		}
		
		return index;
	}
}