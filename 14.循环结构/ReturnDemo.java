/*
	return 返回
		其实它不是用来结束循环的，而是用来结束方法
*/
public class ReturnDemo{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==2){
				System.out.println("退出");
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}