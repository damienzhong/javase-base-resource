/*
	while循环与for循环的区别？
		使用区别：如果想在循环结束后，继续使用控制条件的那个变量，就使用while循环，否则使用for循环。不知道用fpr循环。
		因为变量及早的从内存中消失，可以提高内存的使用效率。
	还有一种场景：
		如果是一个范围的，用for循环非常明确。
		如果是不明确要做多少次，用while循环较为合适。
*/
import java.util.*;
public class WhileDemo2{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println("祝大家端午节快乐，代码越敲越溜！");
		}
		//这里不能再继续访问了
		//System.out.println(i);
		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		while(j<10){
			System.out.println("祝大家端午节快乐，代码越敲越溜！");
			j++;
		}
		System.out.println(j);
	}
}