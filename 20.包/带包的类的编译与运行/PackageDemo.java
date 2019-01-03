/*
	包：
		A：其实就是文件夹
		B：作用
			a：把相同的类名放到不同的包中
			b：对类进行分类管理
			
	举例：
		学生：增加、删除、修改、查询
		老师：增加、删除、修改、查询
		。。。。
		
		方案1：按照功能分
			com.damien.add
				AddStudent
				AddTeacher
			com.damien.del
				DelStudent
				DelTeacher
			com.damien.update
				UpdateStudent
				UpdateTeacher
			com.damien.find
				FindStudent
				FindTeacher
		方案2：按照模块分
			com.damien.student
				AddStudent
				DelStudent
				UpdateStudent
				FindStudent
			com.damien.teacher
				AddTeacher
				DelTeacher
				UpdateTeacher
				FindTeacher
		
	包的定义：
		package 包名;
		多级包用.分开即可
	注意事项：
		package语句必须是程序的第一条可执行的代码。
		package语句在一个Java文件中只能有一个。
		如果没有package，默认表示无包名
	带包的类的编译和运行：
		手动式：
			a:javac编译当前类文件
			b:手动建立包对应的文件夹
			c:把a步骤的class文件放到b步骤的最终文件夹下
			d:通过java命令运行
				需要带包名称的执行。
				java com.damien.PackageDemo
		自动式：
			javac编译的时候带上-d即可
				java -d . PackageDemo.java
			通过java命令运行，和手动式一样。
*/
package com.damien;

public class PackageDemo{
	public static void main(String[] args){
		System.out.println("呆萌钟的淘宝男装店：DM超人社区 冬装上线拉，欢迎大家进店选购");
	}
}