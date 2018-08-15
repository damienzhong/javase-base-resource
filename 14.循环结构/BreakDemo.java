/*
	跳转控制语句：
		1、break 中断
		2、continue  继续
		3、return	返回
		
	break：中断
	使用场景：
		A：switch语句中
		B：循环语句中
			（循环语句中加入if判断的情况）
		注意：离开上面两种场景，无意义
	
	如何使用？
		A：跳出单层循环
		B：跳出多层循环
			要想实现多层循环，就必须知道一个东西。
			带标签的语句：
				格式：
					标签名:语句
*/
public class BreakDemo{
	public static void main(String[] args){
		//在 switch 或 loop 外部中断
		//break;
		
		//跳出单层循
		for(int i = 0;i<10;i++){
			if(i==2){
				break;
			}
			System.out.println("我的淘宝男装店铺名叫DM潮人社区");
		}
		System.out.println("广告时间结束");
		System.out.println("============================");
		
		wc:for(int i = 0;i<5;i++){
			nc:for(int j=0;j<4;j++){
				if(j==2){
					break nc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}