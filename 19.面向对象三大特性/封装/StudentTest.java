/**
	private最常见的应用：
		把成员变量用private修饰
		提供对应的getXxx()/setXxx()方法
*/
//定一个学生类
class Student{
	//姓名
	private String name;
	//年龄
	private int age;
	
	//获取姓名值
	public String getName(){
		return name;
	}
	
	//设置姓名值
	public void setName(String n){
		name = n;
	}
	
	//获取年龄值
	public int getAge(){
		return age;
	}
	
	//设置年龄值
	public void setAge(int a){
		age = a;
	}
}

public class StudentTest{
	public static void main(String[] args){
		//创建学生对象
		Student s = new Student();
		//使用成员变量
		//错误：被私有修饰，外界不能直接访问
		//System.out.println(s.name + "---"+ s.age);
		System.out.println(s.getName()+"---"+s.getAge());
		
		//给成员变量赋值
		//s.name = "范冰冰";
		//s.age = 28;
		//通过方法赋值
		s.setName("范冰冰");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}