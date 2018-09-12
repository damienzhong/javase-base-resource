/**
	我们一直在使用构造方法，但是，我们却没有定义构造方法，用的是哪里来的呢？
	
	构造方法的注意事项：
		A：如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
		B：如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
			注意：如果我们还想使用无参构造方法，就必须自己给出，建议永远自己给出无参构造方法
		
	给成员变量赋值有两种方式：
		A：setXxx();
		B：构造方法
*/
class Student{
	
	private String name;
	private int age;
	
	public Studesnt(){
		System.out.println("这是无参构造方法");
	}
	
	//构造方法的重载
	public Student(String name){
		System.out.println("这是一个带String类型的构造方法");
		this.name = name;
	}
	
	public Student(int age){
		System.out.println("这是一个带int类型的构造方法");
		this.age = age;
	}
	
	public Student(String name,int age){
		System.out.println("这是一个带两个参数的构造方法");
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println(this.name + "----"+this.age);
	}
	
}

public class ConstructDemo2{
	public static void main(String[] args){
		//创建对象
		Student s = new Student();
		s.show();
		System.out.println("------------");
		//创建对象2
		Student s2 = new Student("呆萌钟");
		s2.show();
		System.out.println("------------");
		//创建对象3
		Student s3 = new Student(18);
		s3.show();
		System.out.println("------------");
		//创建对象4
		Student s4 = new Student("呆萌钟",18);
		s4.show();
		System.out.println("------------");
	}
}