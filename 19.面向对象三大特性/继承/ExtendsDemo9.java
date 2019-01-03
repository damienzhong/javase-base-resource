/*
	方法重写：子类中出现了和父类中方法声明一摸一样的方法。
	
	方法重载：
		本类中出现的方法名一样，参数列表不同的方法，与返回值无关。
		
	子类对象调用方法的时候：
		先找子类本身，再找父类。
		
	方法重写的应用：
		当子类需要父类的功能，而功能主题子类有自己特有内容时，可以重写父类中的方法。
		这样，即沿袭了父类的功能，又定义了子类特有的内容。
		
		
*/
class IPhoneX{
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
}

class IPhoneXMax extends IPhoneX{
	public void call(String name){
		//System.out.println("给"+name+"打电话");
		super.call(name);
		System.out.println("可以装逼炫富的功能");
	}
}

public class ExtendsDemo9{
	public static void main(String[] args){
		IPhoneXMax xMax = new IPhoneXMax();
		xMax.call("呆萌钟");
	}
}