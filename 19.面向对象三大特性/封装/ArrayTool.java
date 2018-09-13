public class ArrayTool{
	//把构造方法私有，外界就不能再创建对象了
	private ArrayTool(){}
	
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
}