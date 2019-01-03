/*
	面试题：
		要求请填空，分别输出30，20，10
		
		注意：
			1：内部类和外部类没有继承关系
			2：通过外部类名限定this对象
				Outer.this
*/
class Outer{
	public int num = 10;
	class Inner{
		public int num = 20;
		public void show(){
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println(super.num);
			//System.out.println(new Outer().num);
			System.out.println(Outer.this.num);
		}
	}
	

}

public class InnerClassTest{
	public static void main(String[] args){
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}