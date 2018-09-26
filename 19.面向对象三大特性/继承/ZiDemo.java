/*
	继承的代码体现：
		由于继承中方法有一个现象：方法重写。
		所以，父类的功能，就会被子类给覆盖。
		有些时候，我们不想让子类去覆盖掉父类的功能，只能让他使用。
		这个时候，Java就为我们提供了一个关键字：final
		
		final:最终的意思。常见的它可以修饰类、方法、变量。
*/
class Fu{
	public final void show(){
		System.out.println("绝密文件，任何人不能修改");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("这是什么鬼，看不懂，撕掉！");
	}
}

public class ZiDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}