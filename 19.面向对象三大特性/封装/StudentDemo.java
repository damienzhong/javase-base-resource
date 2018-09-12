/**
	static的特点：（它可以修饰成员变量，也可以修饰成员方法）
		A：随着类的加载而加载
			回想main方法
		B：优先于对象存在
		C：被类的所有对象共享
			举例：
				一个班的学生应该公用一个班级编号。
				什么时候该用静态？
				如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的。
		D：可以通过类名调用		
			其实它本身也可以通过对象调用
			推荐使用类名调用
			静态修饰的内容一般我们称其为：与类相关的，类成员。
*/
class Student{
	//非静态变量
	int classNum = 1;
	//静态变量
	static int classNum2 = 2;
}

public class StudentDemo{
	public static void main(String[] args){
		Student s = new Student();
		System.out.println(s.classNum);
		
		System.out.println(Student.classNum2);
		System.out.println(s.classNum2);
	}
}