/**
	把大象装进冰箱	
	
	面向过程：动作由哪些呢？A：打开冰箱	B：装进大象	C：关闭冰箱门
	
	
*/
public class Demo{
	public static void main(String[] args){
		/*System.out.println("打开冰箱");
		System.out.println("装进大象");
		System.out.println("关闭冰箱门");
		*/
		open();
		in();
		close();
	}
	
	public static void open(){
		System.out.println("打开冰箱");
	}
	
	public static void in(){
		System.out.println("装进大象");
	}
	
	public static void close(){
		System.out.println("关闭冰箱门");
	}
}

/**
	面向对象：
		我们怎么才能更符合面向对象的思想？
			A：有哪些类？
			B：每个类有哪些东西？
			C：类与类之间的关系是什么？
			
	把大象装进冰箱的分析？（如何分析有哪些类？UML。名词提取法）
	
		A：有哪些类？
			大象
			冰箱
			Demo
		B：每个类有哪些东西？
			大象：
				进去
			冰箱：
				开门
				关门
			Demo：
				main方法
		C：类与类之间的关系是什么？
			Demo中使用大象和冰箱类的功能
		
			
		class 大象{
			public static void in(){
				System.out.println("装进大象");
			}
		}
		
		class 冰箱{
			public static void in(){
				System.out.println("装进大象");
			}
	
			public static void close(){
				System.out.println("关闭冰箱门");
			}
		}
			
		class Demo{
			public static void main(String[] args){
				冰箱调用开门
				大象调用进去
				冰箱调用关门
			}
		}
			
			
			
*/




