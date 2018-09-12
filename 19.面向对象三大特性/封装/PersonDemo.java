/**
	定义一个人类
	
	姓名和年龄都是变化的，这个我们能接受，因为每个人的性别和年龄都是不同的。
	但是，我们现在选取的几个人都是中国人，他们的国籍都是一样的。
	一样的国籍，我每次创建对象，在堆内存中都要开辟这样的空间。
	浪费了空间。
	怎么办？
	针对多个对象有共同的成员变量值的时候
	java就提供了一个关键字来修饰：static
*/
class Person{
	//姓名
	String name;
	//年龄
	int age;
	//国籍
	//String country; 
	static String country; 
	
	public Person(){}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show(){
		System.out.println("姓名："+this.name+",年龄："+this.age+",国籍："+country);
	}
}

public class PersonDemo{
	public static void main(String[] args){
		//创建对象1
		Person p1 = new Person("呆萌钟",23,"中国");
		p1.show();
		//创建对象2
		//Person p2 = new Person("眨眼间",24,"中国");
		//p2.show();
		Person p2 = new Person("眨眼间",24);
		p2.show();
		
		//创建对象2
		//Person p3 = new Person("凤姐",31,"中国");
		//p3.show();
		Person p3 = new Person("凤姐",31);
		p3.show();
		System.out.println("---------------------");
		p3.country = "美国";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
	
	