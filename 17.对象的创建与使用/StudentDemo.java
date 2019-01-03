/*
	在一个Java文件中写两个类：一个基本类，一个测试类
	注意：因为我们本次要使用StudentDemo类做测试，他是主体，所以我们要保持文件名与测试类名一致
	
	如何使用呢？
		创建对象使用
	
	如何创建对象？
		格式：类名 对象名 = new 类名();
		
	如何使用成员变量？
		对象.变量名
	如何使用方法？
		对象.方法名(...);
*/
class Student{
	//定义成员变量
	//姓名
	String name;
	//年龄
	int age;
	//性别
	String sex;
	
	//定义成员方法
	//学习的方法
	public void study(){
		System.out.println("我在看呆萌钟的Java视频学习中ing...");
	}
	
	//吃饭的方法
	public void eat(){
		System.out.println("大口吃饭中ing...");
	}
	
	//睡觉的方法
	public void sleep(){
		System.out.println("天色好晚，我要睡觉啦~");
	}
}

//这是测试类
class StudentDemo{
	public static void main(String[] args){
		//类名 对象名 = new 类名();
		Student s = new Student();
		System.out.println(s);
		//输出成员变量
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.sex);
		System.out.println(s.name+"==="+s.age+"==="+s.sex);
		//给成员变量赋值
		s.name = "呆萌钟";
		s.age = 18;
		s.sex = "男";
		System.out.println(s.name+"==="+s.age+"==="+s.sex);
		
		//调用方法
		s.study();
		s.eat();
		s.sleep();
	}
}