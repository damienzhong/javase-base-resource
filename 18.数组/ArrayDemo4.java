/*
	定义第一个数组,定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
	定义第二个数组,定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
	定义第三个数组,把第一个数组的地址值赋值给它。(注意类型一致)，通过第三个数组的名称去把元素重复赋值。
	最后，再次输出第一个数组数组名称和元素。
*/
public class ArrayDemo4{
	public static void main(String[] args){
		//定义第一个数组
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("---------------------");
		
		//定义第二个数组
		int[] arr2 = new int[3];
		arr2[0]=40;
		arr2[1]=50;
		arr2[2]=60;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("---------------------");
		
		//定义第三个数组
		int[] arr3 = arr;
		arr3[0] = 100;
		arr3[2] = 200;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}