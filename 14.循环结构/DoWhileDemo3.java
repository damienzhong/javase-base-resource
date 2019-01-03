/*
	注意死循环：
		A:一定要注意控制条件语句控制的那个变量的问题，不要弄丢了，不然就容易造成死循环
*/
public class DoWhileDemo3{
	public static void main(String[] args){
		int x = 0;
		while(x<10){
			System.out.println(x);
			x++;
		}
		System.out.println("-----------------------");
		/*
		while(true){
			System.out.println("今天我很高兴，学会了把循环给弄死");
		}
		*/
		
		for(;;){
			System.out.println("今天我很高兴，学会了把循环给弄死");
		}
		
		//System.out.println("程序死了吗？");
		
		
	}
}