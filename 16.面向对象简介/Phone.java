/**
	手机事物：
		属性：品牌，价格，颜色
		行为：打电话，发短信，玩游戏
	
	手机类：
		成员变量：品牌，价格，颜色
		成员方法：打电话，发短信，玩游戏
*/
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