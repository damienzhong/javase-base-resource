/**
	数据类型[][] 变量名 = new 数据类型[][]{{元素1},{元素2},{元素3}....};
	
	简化版本：
		数据类型[][] 变量名 = {{元素1},{元素2},{元素3}....};
		
	举例：
		int[][] arr = {{1,2,3},{4,5},{6}};
*/
public class Array2Demo3{
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5},{6}};
		
		System.out.println(arr);//地址值
		System.out.println(arr[0]);//地址值
		System.out.println(arr[1]);//地址值
		System.out.println(arr[2]);//地址值
		
		System.out.println(arr[0][0]);//1
		System.out.println(arr[1][0]);//4
		System.out.println(arr[2][0]);//6
		
		System.out.println(arr[0][1]);//2
		System.out.println(arr[1][1]);//5
		
		System.out.println(arr[2][1]);//错误，数组下标越界
	}
}