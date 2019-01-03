class Phone{
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;
	
	//打电话
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	
	//发短信
	public void sendMessage(){
		System.out.println("发短信。。。");
	}
	
	//玩游戏
	public void playGame(){
		System.out.println("王者荣耀carry中。。。");
	}
}

class PhoneDemo{
	public static void main(String[] args){
		//使用前需要创建对象
		//类名 对象名 = new 类名();
		Phone p = new Phone();
		
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
		//给成员赋值
		p.brand = "iPhone X";
		p.price = 6888;
		p.color = "黑色";
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
		//调用方法
		p.call("呆萌钟");
		p.sendMessage();
		p.playGame();
		
		System.out.println("------------------------");
		
		Phone p2 = new Phone();
		
		System.out.println(p2.brand+"==="+p2.price+"==="+p2.color);
		
		//给成员赋值
		p2.brand = "锤子";
		p2.price = 2299;
		p2.color = "红色";
		System.out.println(p2.brand+"==="+p2.price+"==="+p2.color);
		
		//调用方法
		p2.call("迪丽热巴");
		p2.sendMessage();
		p2.playGame();
		System.out.println("------------------------");
		Phone p3 = p;
		System.out.println(p3.brand+"==="+p3.price+"==="+p3.color);
		
		//给成员赋值
		p3.brand = "华为";
		p3.price = 1999;
		p3.color = "蓝色";
		System.out.println(p3.brand+"==="+p3.price+"==="+p3.color);
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
	}
}