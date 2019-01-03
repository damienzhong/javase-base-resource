/**
	一个标准类的最终版
	
	学生类：
		成员变量：
			name,age
		构造方法：
			无参，带两个参
		成员方法：
			getXxx()/setXxx()
			show();输出该类的所有成员变量值
	给成员变量赋值：
		A：setXxx();
		B：构造方法
	输出成员变量的方式“
		A：通过getXxx分别获取然后拼接
		B：通过调用show()方法
		
	注意：
		目前的代码是为了练习的一种标准格式
		给成员变量辅助有两种方式，可以只写一种
		如果不单独获取数据，可以不写getXxx()方法
		
	类的初始化过程：
		加载Student.class文件进内存
		在栈内存中为s开辟空间
		在堆内存中为学生对象开辟空间
		对学生对象的成员变量进行默认初始化
		对学生对象的成员变量进行显示初始化
		通过构造方法对学生对象的成员变量赋值
		学生对象初始化完毕，把对象地址赋值给s
*/
class Student{
	//姓名
	private String name = "呆萌钟";
	//年龄
	private int age = 23;
	
	public Student(){}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	//输出所有的成员变量
	public void show(){
		System.out.println(name+"---"+age);
	}
}

//测试类
public class StudentTest3{
	public static void main(String[] args){
		//方式1给成员变量赋值
		Student s = new Student("啊呆老师",24);
		s1.show();
		
		
		/*s1.setName("呆萌钟");
		s1.setAge(24);
		//输出值
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println();
		
		//方式2给成员变量赋值
		Student s2 = new Student("呆萌钟2",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();*/
	}
}