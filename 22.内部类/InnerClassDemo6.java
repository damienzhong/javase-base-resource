/*
	匿名内部类在开发中的使用
*/
interface Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

class Student implements Person{
	public void study(){
		System.out.println("好好学习");
	}
}

public class InnerClassDemo6{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("----------------------");
		pd.method(new Person(){
				public void study(){
					System.out.println("好好学习");
				}
			}
		);
	}
}