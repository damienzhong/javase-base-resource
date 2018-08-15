/*
	++,--的练习题
	
	第一题：
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	请分别计算出a,b,c的值
	
	第二题：
	int x = 4;
	int y = (x++)+(++x)+(x*10);
	请分别计算出x,y的值
*/
public class OperatorTest{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		int c = 10;
		
		a = b++;
		c = --a;
		b = ++a;
		a = c--;
		
		System.out.println("a:" + a);//9
		System.out.println("b:" + b);//10
		System.out.println("c:" + c);//8
		System.out.println("=========================");
		
		int x = 4;
		int y = (x++)+(++x)+(x*10);
				 //4	+ 6    +  60
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
}