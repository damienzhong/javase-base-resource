/*
	多态的好处：
		A：提高了代码的维护性（继承保证）
		B：提高了代码的扩展性(由多态保证)
		
	猫狗案例
*/
class Animal{
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("狗吃肉");
	}
	
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	
	public void sleep(){
		System.out.println("猫趴着睡觉");
	}
}

class Pig extends Animal{
	public void eat(){
		System.out.println("猪吃饭");
	}
	
	public void sleep(){
		System.out.println("猪侧着睡觉");
	}
}

//针对动物操作的工具类
class AnimalTool{
	private AnimalTool(){}
	/*8public static void useCat(Cat c){
		c.eat();
		c.sleep();
	}
	
	public static void useDog(Dog d){
		d.eat();
		d.sleep();
	}
	
	public static void usePig(Pig p){
		p.eat();
		p.sleep();
	}*/
	public static void useAnimal(Animal a){
		a.eat();
		a.sleep();
	}
}

public class DuoTaiDemo2{
	public static void main(String[] args){
		//养一只猫
		Cat c = new Cat();
		c.eat();
		c.sleep();
		//我特别喜欢猫，又养了一只
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		//再一只猫
		Cat c3 = new Cat();
		c3.eat();
		c3.sleep();
		System.out.println("-------------------");
		//问题来了，我养了很多只猫，每次创建对象是可以接受的，
		//但是呢？调用方法，除了对象名不同外，其他代码冗余了。
		//AnimalTool.useCat(c);
		//AnimalTool.useCat(c2);
		//AnimalTool.useCat(c3);
		//System.out.println("-------------------");
		//我还喜欢狗，养了只狗
		Dog d = new Dog();
		//再养一只狗
		Dog d2 = new Dog();
		/*AnimalTool.useDog(d);
		AnimalTool.useDog(d2);
		*/
		System.out.println("-------------------");
		//我喜欢宠物猪
		//定义一个猪类，它要继承自动物，提供两个方法，并且还得再工具类中添加该类方法调用
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();
		/*AnimalTool.usePig(p);
		AnimalTool.usePig(p2);
		AnimalTool.usePig(p3);*/
		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(c2);
		AnimalTool.useAnimal(c3);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(d2);
		AnimalTool.useAnimal(p);
		AnimalTool.useAnimal(p2);
		AnimalTool.useAnimal(p3);
	}
	
}