/*
	案例：定义一个学生类
	
	学生事物：
		属性：姓名，年龄，性别
		行为：学习，吃饭，睡觉
	
	把事物要转化为对应的类：
	
	学生类：
		成员变量：姓名，年龄，性别
		成员方法：学习，吃饭，睡觉
		
	成员变量：和以前变量的定义是一样的格式，但是位置不同，在类中方法外。
	成员方法：和以前的方法定义是一样的格式，但是我们今天先去掉static。
	
	首先我们应该定义一个类，然后完成类的成员。

*/
//这就是学生类
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