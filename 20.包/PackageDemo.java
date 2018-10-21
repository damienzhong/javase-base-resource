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
*/
package com.damien;

public class PackageDemo{
	
}