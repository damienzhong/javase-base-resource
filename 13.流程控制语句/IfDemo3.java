/*
	if语句第二种格式:
					if(关系表达式) {
							 语句体1;
					}else {
							 语句体2;
					}
	
	执行流程:
			首先判断关系表达式看其结果是true还是false
			如果是true就执行语句体1
			如果是false就执行语句体2
*/
public class IfDemo3{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		if(a == b){
			System.out.println("a等于b");
		}else{
			System.out.println("a不等于b");
		}
	}
}