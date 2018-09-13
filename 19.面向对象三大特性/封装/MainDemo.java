/**
	 main方法的格式讲解：
		public static void main(String[] args){}
		
		public:公共的，访问权限是最大的。由于main方法是被jvm调用，所有权限要够大
		static:静态的，不需要创建对象，通过类名就可以使用。方法jvm调用
		void:方法的返回值是返回给调用者的，而main方法是被jvm调用，返回内容给jvm没有意义
		main:是一个常见的方法入口，还有很多语言都是用main方法作为入口的
		String[] args:这是一个字符串数组。
					有什么用？怎么给值？
					这个东西早期是为了接收键盘录入的数据。（因为jdk5之前没用Scanner）
					格式：
						java 类名 hello world java
*/
public class MainDemo{
	public static void main(String[] args){
		//System.out.println(args);//[Ljava.lang.String;@6d06d69c
		//System.out.println(args.length);//0
		//System.out.println(args[0]);// java.lang.ArrayIndexOutOfBoundsException: 0
		
		//接收数据后的数据输出
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		
		for(int x=0;x<args.length;x++){
			System.out.println(args[x]);
		}
	}
}