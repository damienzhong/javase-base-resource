/*
	强制类型转换:从大的数据类型到小的数据类型。
	
		格式：	目标类型 变量名 = (目标类型)(被转换的数据);	
		注意：
			不要随意的去使用强制转换，因为他隐含了精度损失问题。
		
*/
public class DataTypeDemo4{
	public static void main(String[] args){
		
		byte a = 3;
		int b = 4;
		//这个肯定没有问题
		//int c = a + b;
		
		//byte c = 7;
		//有问题
		//byte c = a + b;
		
		//用强制类型转换改进
		byte c = (byte)(a + b);
		System.out.println(c);
		//byte d = (byte)a + b;//错误
	}
}