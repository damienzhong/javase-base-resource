/*
	循环语句的区别：
		do..while循环至少会执行一次循环体
		而for，while循环必须先判断条件是否成立，然后决定是否执行循环体
		
	那么，我们一般使用哪种循环呢？
		优先考虑for，其次考虑while,最后考虑do..while
*/
public class DoWhileDemo2{
	public static void main(String[] args){
		int x = 3;
		while(x<3){
			System.out.println("DM潮人社区的衣服超酷的哟~");
			x++;
		}
		System.out.println("------------------------------");
		int y = 3;
		do{
			System.out.println("DM潮人社区的衣服超酷的哟~");
			y++;
		}while(y<3);
	}
}