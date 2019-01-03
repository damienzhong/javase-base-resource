/*
	形式参数的问题：
		基本类型：形式参数的改变不影响实际参数
		引用类型：形式参数的改变直接影响实际参数
*/
//形式参数是基本类型
class Demo{
	public int sum(int a,int b){
		return a + b;
	}
}

//形式参数是引用类型
class Student{
	public void study(){
		System.out.println("看呆萌钟的视频有助于我的Java学习");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}

public class ArgsTest{
	public static void main(String[] args){
		//形式参数是基本类型的调用
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
		System.out.println("---------------");
		
		//形式参数是引用类型的调用
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}