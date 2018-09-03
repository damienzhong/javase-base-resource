/**
	定义一个女朋友：
		成员变量：name,cup,age
		成员方法：show()
		
	我们在使用这个案例的过程中，发现了一个问题
		通过对象去给成员变量赋值，可以赋值一些非法的数据。
		这是不合理的。
		我们应该在赋值之前，先对数据进行判断
		判断在哪里比较合适呢？
		GirlFriendDemo是一个测试类，测试类一般只创建对象，调用方法。
		所以，这个判断应该定义在GirlFriend类中
		我们在成员变量的位置不可以进行数据判断，因为数据校验，必须要依靠逻辑语句。
		有逻辑的这些语句我们应该定义在方法中。
		所以，我们应该在GirlFriend类中提供一个方法来进行数据校验
		
	按照我们前面的分析，我们给出了一个方法进行校验。
	但是呢，它偏偏不调用方法来赋值，还是直接赋值，这样我们的方法就没用起到作用。
	我们就应该要求调用者必须使用我的方法，而不能直接通过调用成员变量赋值。
	怎么去强制要求不能直接使用成员变量呢？
		针对这种情况，Java就提供了一个关键字private
		
	private:私有的。它可以直接修饰成员变量和成员方法
		注意：被private修饰的成员只能在本类中使用
		
	其实，我们描述的就是一个封装思想。
	封装：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
*/
class GirlFriend{
	//姓名
	String name;
	//年龄
	private int age;
	//胸围
	String cup;
	
	//写一个方法对数据进行校验
	/*
		返回值类型：void
		参数列表：int a
	*/
	public void setAge(int a){
		if(a<25&&a>16){
			age = a;
		}else{
			System.out.println("该年龄不是我的菜！");
		}
	}
	
	//成员方法
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("胸围："+cup);
	}
}

public class GirlFriendDemo{
	public static void main(String[] args){
		//制作一个女朋友
		GirlFriend gf = new GirlFriend();
		gf.name = "迪丽热巴";
		//gf.age = 18;
		gf.cup = "C";
		gf.show();
		System.out.println("----------------------");
		gf.name = "罗玉凤";
		//gf.age = 38;
		gf.cup = "A";
		gf.show();
		System.out.println("----------------------");
		gf.setAge(18);
		gf.show();
		System.out.println("----------------------");
		//gf.age = 48;
		gf.show();
	}
}