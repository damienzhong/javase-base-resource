/*
	用*符号输出一个正三角形
		*
		**
		***
		****
		*****
*/
public class ForForTest2{
	public static void main(String[] args){
		//5行5列
		for(int i = 0;i<5;i++){
			for(int j = 0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
			第1行1个
			第2行2个
			第3行3个
			第4行4个
			第5行5个
			*/
		for(int i = 0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}