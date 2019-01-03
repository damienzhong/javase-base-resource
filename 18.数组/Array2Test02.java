/**
	公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99
*/
public class Array2Test02{
	public static void main(String[] args){
		//把题目的数据用二维数组来表示
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		
		//定义一个求和遍历sum，初始化值为0
		int sum = 0;
		
		//通过遍历就可以得到每一个二维数组的元素
		for(int x = 0;x<arr.length;x++){
			for(int y = 0;y<arr[x].length;y++){
				//把元素累加
				sum += arr[x][y];
			}
		}
		System.out.println("一年的销售额为："+ sum + "万元");
	}
}