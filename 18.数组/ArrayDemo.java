/*
	数组：存储同一种数据类型的多个元素的内容
	数组支持类型:既可以存储基本数据类型，也可以存储引用数据类型
	
	定义格式：
		A：数据类型[] 数组名
		B：数据类型 数组名[]
	举例：
		A: int[] a;	定义一个int类型的数组a变量
		B: int a[];	定义一个int类型的a数组变量
		
	注意：效果可以认为是一样的，都是定义一个int数组，但是念法上有些小区别。推荐使用第一种
	
	如何堆数组进行初始化？
		A：何谓初始化？就是为数组开辟内存空间，并为每个数组元素赋值
		B：有两种方式：
			a：动态初始化	只指定长度，由系统给出初始化值
			b：静态初始化	给出初始化值，由系统决定长度
			
	动态初始化的格式：
		数据类型[] 数组名 = new 数据类型[数组长度]
		int[] arr = new int[3];
	
	如何获取数组中的元素？
		通过：
			数组名[索引]
			索引其实就是每个元素的编号，从0开始，最大索引是数组长度-1
*/
public class ArrayDemo{
	public static void main(String[] args){
		//定义一个数组
		//可能尚未初始化变量arr
		//int[] arr;
		//System.out.println(arr);
		
		int[] arr = new int[3];
		/*
			左边：
				int:说明数组中的元素的数据类型是int类型
				[]：说明这是一个数组
				arr：是数组的名称
			右边：
				new：为数组分配内存空间
				int: 说明数组中的元素的数据类型是int类型
				[]：说明这是一个数组
				3:数组长度，其实就是数组中元素的个数
		*/
		System.out.println(arr);//[I@6d06d69c	地址值
		//获取数组元素
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
	}
}
