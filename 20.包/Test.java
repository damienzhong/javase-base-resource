/*
	测试类
*/
package cn.damien;

class Test{
	public static void main(String[] args){
		//Demo d = new Demo();
		com.damien.Demo d = new com.damien.Demo();
		System.out.println(d.sum(10,20));
		
		com.damien.Demo d2 = new com.damien.Demo();
		System.out.println(d2.sum(10,20));
		
		com.damien.Demo d3 = new com.damien.Demo();
		System.out.println(d3.sum(10,20));
		
		com.damien.Demo d4 = new com.damien.Demo();
		System.out.println(d4.sum(10,20));
	}
}

/*
	第一个问题：找不到Demo
	第二个问题：程序包com.damien不存在
	第三个问题：Demo在com.damien中不是公共的; 无法从外部程序包中对其进行访问
*/