/**
*	数组常用操作工具类
*	@author 呆萌在
*	@version v1.0
*/
public class ArrayTool{
	//把构造方法私有，外界就不能再创建对象了
	private ArrayTool(){}
	
	/**
	*	遍历数组
	*	@param arr
	*/
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
	
	/**
	*	获取指定数值的索引
	*	@param arr,value
	*	@return int
	*/
	public static int getIndex(int[] arr,int value){
		int index = -1;
		
		for(int x=0;x<arr.length;x++){
			if(arr[x]==value){
				index = x;
				break;
			}
		}
		return index;
	}
	
	/**
	*	获取数组中的最大值
	*	@param arr
	*	@return int
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max = arr[x];
			}
		}
		return max;
	}
}