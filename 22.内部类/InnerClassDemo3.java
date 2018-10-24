/*
	成员内部类的修饰符：
		private:为了保证数据的安全性
		static:为了方便访问数据
			注意：静态内部类访问的外部类数据必须用静态修饰。
	
	案例：我是一个人（人有身体，身体内有心脏）
	
		class Body{
			
			private class Heart{
				public void operator(){
					System.out.println("心脏支架手术");
				}
			}
			
			public void method(){
				if(如果你是外科医生){
					Heart h = new Heart();
					h.operator();
				}
			}
		}
		
		按照我们刚才的讲解，来使用一下。
		Body.Heart bh = new Body().new Heart();
		bh.operator();
		//加了private之后，就不能被访问了，那么，怎么玩呢？
		Body b = new Body();
		b.method();
*/
class Outer{
	private int num = 10;
	private static int num2 = 100;
	
	public static class Inner{
		public void show(){
			//System.out.println(num);
			System.out.println(num2);
		}
		
		public static void show2(){
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}

public class InnerClassDemo3{
	public static void main(String[] args){
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show();
		//oi.show2();
		//成员内部类被静态修饰后的访问方式：
		//格式：外部类名.内部类名 对象名 = new 外部类名.内部类名
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		Outer.Inner.show2();
	}
}