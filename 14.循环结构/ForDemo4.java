/*
	需求：
		A:求1-100之和。

		B:求出1-100之间偶数和

		C:求出1-100之间奇数和(你们自己做)
*/
public class ForDemo4{
	public static void main(String[] args){
		//求1-100之和
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		System.out.println("==============");
		//求出1-100之间偶数和
		//方式一
		int sum2 = 0;
		for(int i=1;i<=100;i++){
			if(i%2 == 0){
				sum2 += i;
			}
		}
		System.out.println(sum2);
		System.out.println("==============");
		//方式二
		int sum3 = 0;
		for(int i=0;i<=100;i+=2){
			sum3 += i;
		}
		System.out.println(sum3);
	}
}