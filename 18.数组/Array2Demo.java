/**
	二维数组其实就是一个元素为一维数组的数组。
	
	格式1：
		数据类型[][] 数组名 = new 数据类型[m][n];
		m:表示这个二位数组又多少个一维数组
		n:表示每一个一维数组的元素有多少个
		
	注意：
		A：以下格式也可以表示二维数组
			数据类型 数组名[][] = new 数据类型[m][n];
			数据类型[] 数组名[] = new 数据类型[m][n];
		B：注意下面定义
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];
*/
public class Array2Demo{
	public static void main(String[] args){
		//定义一个二维数组
		int[][] arr = new int[3][2];
		//定义了一个二维数组arr
		//这个二位数组有3个一维数组的元素
		//每一个一维数组有2个元素
		//输出二维数组名称
		System.out.println(arr);//地址值  [[I@6d06d69c
		//输出二维数组的第一个元素一维数组的名称
		System.out.println(arr[0]);//地址值	[I@7852e922
		System.out.println(arr[1]);//地址值	[I@4e25154f
		System.out.println(arr[2]);//地址值	[I@70dea4e
		//输出二维数组的元素
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
	}
}