/**
	数据类型[][] 变量名 = new 数据类型[m][];
	
	m表示这个二维数组有多少个一维数组
	这一次没有直接给出一维数组的元素个数，是因为后面我们可以动态给出
	
*/
public class Array2Demo2{
	public static void main(String[] args){
		//定义数组
		int[][] arr = new int[3][];
		
		System.out.println(arr);//[[I@6d06d69c
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		System.out.println("-------------------------");//null
		//动态的为每一个一维数组分配空间
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr[0]);//[I@7852e922
		System.out.println(arr[1]);//[I@4e25154f
		System.out.println(arr[2]);//[I@70dea4e
		
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[0][2]);
		
		arr[1][0] = 100;
		arr[1][2] = 200;
		
		System.out.println(arr[1][0]);//0
		System.out.println(arr[1][2]);//0
	}
}